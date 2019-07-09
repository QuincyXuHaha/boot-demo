package com.quincy.bootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 86158
 * @date 2019/7/9 星期二
 */
@RequestMapping("/test/")
public interface ITestController {
    @GetMapping("test")
    String test();
    @GetMapping("hello")
    String hello();
}
