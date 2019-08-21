package com.aitlp.poet.service.impl;

import com.aitlp.author.data.Author;
import com.aitlp.author.service.IAuthorService;
import com.aitlp.base.util.FileUtil;
import com.aitlp.base.util.UUIDUtil;
import com.aitlp.poet.dao.PoetMapper;
import com.aitlp.poet.data.PoetDTO;
import com.aitlp.poet.data.PoetExample;
import com.aitlp.poet.data.PoetWithBLOBs;
import com.aitlp.poet.service.IPoetService;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PoetServiceImpl implements IPoetService {
    @Value("${poet.path}")
    private String rootPath;

    @Autowired
    private PoetMapper poetMapper;

    @Autowired
    private IAuthorService authorService;

    @Override
    public void handlePoet(String dynasty) {
        List<String> allFileList = FileUtil.listAllFiles(rootPath + "/json");
        List<String> poetJsonList;
        if (StringUtils.equals(dynasty, "1")) {
            poetJsonList = allFileList.stream().filter(fileName -> fileName.contains("poet.tang")).collect(Collectors.toList());
        } else {
            poetJsonList = allFileList.stream().filter(fileName -> fileName.contains("poet.song")).collect(Collectors.toList());
        }

        // 按文件名数字排序
        poetJsonList = poetJsonList.stream().sorted(Comparator.comparingInt(o -> Integer.parseInt(o.replaceAll("\\D+", "")))).collect(Collectors.toList());
        if (!ObjectUtils.isEmpty(poetJsonList)) {
            List<PoetDTO> poetDTOs;
            for (String filePath : poetJsonList) {
                if (!StringUtils.contains(filePath, "poet.")) {
                    continue;
                }
                poetDTOs = JSONArray.parseArray(FileUtil.readFileContent(filePath), PoetDTO.class);
                if (!ObjectUtils.isEmpty(poetDTOs)) {
                    for (PoetDTO poetDTO : poetDTOs) {
                        Author exampleAuthor = new Author();
                        exampleAuthor.setAuthorName(poetDTO.getAuthor());
                        exampleAuthor.setDynasty(dynasty);
                        List<Author> authors = authorService.selectAuthors(exampleAuthor);
                        PoetWithBLOBs poetWithBLOBs = poetDTO.changeToPoet();
                        if(ObjectUtils.isEmpty(authors)){
                            System.out.println(poetDTO.getAuthor() + "--该作者未找到");
                        }else{
                            poetWithBLOBs.setAuthorId(authors.get(0).getId());
                        }
                        poetWithBLOBs.setDynasty(dynasty);
                        savePoet(poetWithBLOBs);
                    }
                }
            }
        }

    }

    @Override
    public int savePoet(PoetWithBLOBs poetWithBLOBs) {
        if (ObjectUtils.isEmpty(poetWithBLOBs.getId())) {
            poetWithBLOBs.setId(UUIDUtil.uuid());
            return poetMapper.insert(poetWithBLOBs);
        } else {
            return poetMapper.updateByExample(poetWithBLOBs, new PoetExample());
        }
    }
}
