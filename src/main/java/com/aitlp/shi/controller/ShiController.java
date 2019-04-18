package com.aitlp.shi.controller;

import com.aitlp.shi.data.Shi;
import com.aitlp.shi.service.IShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "shiwo/shi")
public class ShiController {
    @Autowired
    private IShiService iShiService;

    @GetMapping(value = "/listByPage")
    public List<Shi> list(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return iShiService.listByPage(pageNo, pageSize);
    }
}
