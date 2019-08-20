package com.aitlp.author.service;

import com.aitlp.author.data.Author;
import com.aitlp.base.model.Page;

import java.util.List;

public interface IAuthorService {

    /**
     * @param pageNo   页码
     * @param pageSize 每页显示描述
     * @param author   查询参数
     * @return
     */
    Page<Author> list(int pageNo, int pageSize, Author author);

    /**
     * 条件查询
     *
     * @return
     */
    List<Author> selectAuthors(Author author);

    /**
     * 保存作者信息
     * @param author
     * @return
     */
    int saveAuthor(Author author);

    /**
     * 处理作者信息
     *
     * @param type
     * @return
     */
    void handleAuthorsOfPoet(String type);

}
