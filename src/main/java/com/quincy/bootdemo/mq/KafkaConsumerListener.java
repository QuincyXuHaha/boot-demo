package com.quincy.bootdemo.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author xuguangquan
 * @date 2019/12/17 星期二
 */
@Slf4j
@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "kafka-topic-test")
    public void consume(String msg) {
        log.info("kafka 接收到topic={}的消息：{}", "kafka-topic-test", msg);
    }

}
