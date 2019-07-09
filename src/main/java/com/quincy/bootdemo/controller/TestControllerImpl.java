package com.quincy.bootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试: 具体见
 * https://blog.csdn.net/forezp/article/details/80069961
 *
 * @author xuguangquan
 * @date 2019/7/9 星期二
 */
@Slf4j
@RestController
public class TestControllerImpl implements ITestController {

    /**
     * 测试结果：父类的方法的注解可以在子类上生效
     * @return test
     */
    @Override
    public String test() {
        log.info("test");
        return "test";
    }

    /**
     * 测试结果：用的子类重写的方法上的注解而不是父类的
     * @return hello
     */
    @GetMapping("hello2")
    @Override
    public String hello() {
        log.info("hello,world.");
        return "hello,world.";
    }
}
