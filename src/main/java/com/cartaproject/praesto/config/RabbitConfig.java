package com.cartaproject.praesto.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("register-exchange");
    }

    @Bean
    public Queue queue() {
        return new Queue("register-queue");
    }

    @Bean
    public Binding binding(TopicExchange exchange, Queue queue) {
        return BindingBuilder
                .bind(queue)
                .to(exchange)
                .with("register-binding");
    }
}
