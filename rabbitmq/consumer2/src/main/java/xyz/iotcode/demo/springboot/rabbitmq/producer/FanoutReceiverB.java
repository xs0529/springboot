package xyz.iotcode.demo.springboot.rabbitmq.producer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xieshuang
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {
 
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverB消费者收到消息  : " +testMessage.toString());
        System.out.println("当前时间  : " +System.currentTimeMillis());
    }
 
}