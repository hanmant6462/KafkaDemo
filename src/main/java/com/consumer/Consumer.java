package com.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

   @KafkaListener(topics = {"my-topic"}, groupId = "abc")
   public void consume(String msg){
        System.out.println(msg);
    }
}
