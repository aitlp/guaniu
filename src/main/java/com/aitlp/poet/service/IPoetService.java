package com.aitlp.poet.service;

import com.aitlp.poet.data.PoetWithBLOBs;

public interface IPoetService {

    /**
     * 处理唐诗/宋诗
     */
    void handlePoet(String dynasty);

    /**
     * 保存唐诗/宋诗
     *
     * @param poetWithBLOBs
     * @return
     */
    int savePoet(PoetWithBLOBs poetWithBLOBs);
}
