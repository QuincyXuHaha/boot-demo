package com.quincy.bootdemo.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

/**
 * @author xuguangquan
 * @date 2019/12/17 星期二
 */
@RequestMapping("/kafka/")
@RestController
public class KafkaController {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send")
    public Object sendMq(String msg) throws ExecutionException, InterruptedException {
        return kafkaTemplate.send("test", msg).get().toString();
    }

}
