package com.aitlp.poet.controller;

import com.aitlp.poet.service.IPoetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 唐诗/宋诗处理
 */
@RestController
@RequestMapping(value = "guaniu/poet")
@Api(value = "唐诗/宋诗正文", tags = "唐诗/宋诗正文")
public class PoetController {

    @Autowired
    private IPoetService poetService;

    @ApiOperation(value = "唐诗/宋诗正文处理", notes = "唐诗/宋诗正文处理")
    @GetMapping(value = "/handlePoet")
    public String handlePoet(@RequestParam(defaultValue = "1") String type) {
        poetService.handlePoet(type);
        return "success";
    }
}
