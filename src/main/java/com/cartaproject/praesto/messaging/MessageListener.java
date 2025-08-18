package com.cartaproject.praesto.messaging;

import com.cartaproject.praesto.services.DocumentService;
import com.cartaproject.praesto.types.messages.MapReference;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    private DocumentService documentService;

    @RabbitListener(queues = "register-queue", containerFactory = "rabbitListenerContainerFactory")
    public void receive(MapReference message) {
        System.out.println(message);
        documentService.createReference(message);
    }
}