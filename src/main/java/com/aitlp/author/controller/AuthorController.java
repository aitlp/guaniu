package com.aitlp.author.controller;

import com.aitlp.author.data.Author;
import com.aitlp.author.service.IAuthorService;
import com.aitlp.base.model.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 唐诗/宋诗作者处理
 */
@RestController
@RequestMapping(value = "shiwo/author")
@Api(value = "唐诗/宋诗作者信息", tags = "唐诗/宋诗作者信息")
public class AuthorController {
    @Autowired
    private IAuthorService authorService;

    @GetMapping(value = "/list")
    public Page list(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize, @ModelAttribute Author author) {
        return authorService.list(pageNo, pageSize, author);
    }

    /**
     * 处理唐诗/宋诗作者(1-唐诗作者，2--宋诗作者)
     */
    @ApiOperation(value = "唐诗/宋诗作者处理", notes = "唐诗/宋诗作者处理")
    @GetMapping(value = "/handleAuthorsOfPoet")
    public String handleAuthorsOfPoet(@RequestParam(defaultValue = "1") String type) {
        authorService.handleAuthorsOfPoet(type);
        return "success";
    }
}
