package com.aitlp.author.service;

import com.aitlp.author.data.Author;

import java.util.List;

public interface IAuthorService {

    /**
     * 分页查询方法
     *
     * @return
     */
    List<Author> list(int pageNo, int pageSize);

    /**
     * 处理作者信息
     *
     * @param type
     * @return
     */
    void handleAuthorsOfPoet(String type);
}
