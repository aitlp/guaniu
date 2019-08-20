package com.aitlp.author.service.impl;

import com.aitlp.author.dao.AuthorMapper;
import com.aitlp.author.data.Author;
import com.aitlp.author.data.AuthorDTO;
import com.aitlp.author.data.AuthorExample;
import com.aitlp.author.service.IAuthorService;
import com.aitlp.base.model.Page;
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
    public Page<Author> list(int pageNo, int pageSize, Author author) {
        PageHelper.startPage(pageNo, pageSize);
        List<Author> list = selectAuthors(author);
        return new Page<>(list);
    }

    @Override
    public List<Author> selectAuthors(Author author) {
        AuthorExample authorExample = new AuthorExample();
        AuthorExample.Criteria criteria = authorExample.createCriteria();
        if (StringUtils.isNoneBlank(author.getAuthorName())) {
            criteria.andAuthorNameLike("%" + author.getAuthorName() + "%");
        }

        if (StringUtils.isNoneBlank(author.getDynasty())) {
            criteria.andDynastyEqualTo(author.getDynasty());
        }

        List<Author> list = authorMapper.selectByExample(authorExample);
        return list;
    }

    @Override
    public int saveAuthor(Author author) {
        int result;
        if (ObjectUtils.isEmpty(author.getId())) {
            author.setId(UUIDUtil.uuid());
            result = authorMapper.insert(author);
        } else {
            result = authorMapper.updateByExample(author, new AuthorExample());
        }
        return result;
    }

    @Override
    public void handleAuthorsOfPoet(String type) {
        List<AuthorDTO> authorDTOS = new ArrayList<>();
        if (StringUtils.equals("1", type)) {
            authorDTOS = JSONArray.parseArray(FileUtil.readFileContent(rootPath + "/json/authors.tang.json"), AuthorDTO.class);
        }
        if (StringUtils.equals("2", type)) {
            authorDTOS = JSONArray.parseArray(FileUtil.readFileContent(rootPath + "/json/authors.song.json"), AuthorDTO.class);
        }

        if (!ObjectUtils.isEmpty(authorDTOS)) {
            Author author;
            for (AuthorDTO authorDTO : authorDTOS) {
                author = authorDTO.changeToAuthor();
                author.setDynasty(type);
                saveAuthor(author);
            }
        }
    }
}
