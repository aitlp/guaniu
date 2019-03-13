package com.aitlp.shi.service.impl;

import com.aitlp.shi.dao.ShiMapper;
import com.aitlp.shi.data.Shi;
import com.aitlp.shi.data.ShiExample;
import com.aitlp.shi.service.IShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiServiceImpl implements IShiService {
    @Autowired
    private ShiMapper shiMapper;

    @Override
    public List<Shi> list() {
        ShiExample shiExample = new ShiExample();
        return shiMapper.selectByExample(shiExample);
    }
}
