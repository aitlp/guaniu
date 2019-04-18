package com.aitlp.shi.service;

import com.aitlp.shi.data.Shi;

import java.util.List;

public interface IShiService {
    /**
     * 分页查询方法
     *
     * @return
     */
    List<Shi> listByPage(int pageNo, int pageSize);
}
