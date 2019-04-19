package com.aitlp.shi.controller;

import com.aitlp.common.model.Page;
import com.aitlp.shi.service.IShiService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "shiwo/shi")
@Api(value = "分页查询诗列表", tags = "分页查询诗列表")
public class ShiController {
    @Autowired
    private IShiService iShiService;

    @GetMapping(value = "/listByPage")
    public Page list(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return new Page(iShiService.listByPage(pageNo, pageSize));
    }
}
