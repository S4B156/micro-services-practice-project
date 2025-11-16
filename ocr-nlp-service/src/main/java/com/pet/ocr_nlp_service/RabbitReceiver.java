package com.pet.ocr_nlp_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitReceiver {
    @RabbitListener(queues = {"${spring.rabbitmq.queue}"})
    public void receive(String message){
        log.info("{} - message from rabbit", message);
    }
}
