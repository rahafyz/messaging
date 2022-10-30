package com.example.messaging.service.rabbitMq;

import com.example.messaging.service.dto.MessageDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @RabbitListener(queues = "duolingo")
    public void getMessage(MessageDTO message) {
        System.out.println(message.getMessage());
    }
}
