package com.aitlp.author.service.impl;

import com.aitlp.author.dao.AuthorMapper;
import com.aitlp.author.data.Author;
import com.aitlp.author.data.AuthorExample;
import com.aitlp.author.service.IAuthorService;
import com.aitlp.base.util.FileUtil;
import com.aitlp.base.util.UUIDUtil;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements IAuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Value("${poet.path}")
    private String rootPath;

    @Override
    public List<Author> list(int pageNo, int pageSize, Author author) {
        AuthorExample authorExample = new AuthorExample();
        AuthorExample.Criteria criteria = authorExample.createCriteria();
        if (StringUtils.isNoneBlank(author.getName())) {
            criteria.andNameLike(author.getName());
        }

        if(StringUtils.isNoneBlank(author.getType())){
            criteria.andTypeEqualTo(author.getType());
        }

        PageHelper.startPage(pageNo, pageSize);
        return authorMapper.selectByExample(authorExample);
    }

    @Override
    public void handleAuthorsOfPoet(String type) {
        List<Author> authors = new ArrayList<>();
        if (StringUtils.equals("1", type)) {
            authors = JSONArray.parseArray(FileUtil.readFileContent(rootPath + "/json/authors.tang.json"), Author.class);
        }
        if (StringUtils.equals("2", type)) {
            authors = JSONArray.parseArray(FileUtil.readFileContent(rootPath + "/json/authors.song.json"), Author.class);
        }

        if (!ObjectUtils.isEmpty(authors)) {
            for (Author author : authors) {
                author.setId(UUIDUtil.uuid());
                author.setType(type);
                authorMapper.insert(author);
            }
        }
    }
}
