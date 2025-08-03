package com.cartaproject.praesto.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "register-queue")
    public void receive(String message) {
        System.out.println(message);
    }
}