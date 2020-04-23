package com.example.demo.model;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/11/16.
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    private PtNoticeManager ptNoticeManager;

    @GetMapping("")
    public Object list() {
        return ptNoticeManager.findAll();
    }

}
