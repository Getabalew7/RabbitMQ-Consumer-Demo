package com.codeaz.rabbitmqconsumerdemo.RabbitMQConfig;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
  @Value("${rabbitmq.queue.name}")
   private String queue_name;

  @Value("${rabbitmq.exchange.name}")
  private String exchange_name;

  @Value("${rabbitmq.routing.key}")
    private String routing_key;

  @Bean
  public Queue queue() {
      return new Queue(queue_name);
  }
  @Bean
  public TopicExchange exchange(){
      return new TopicExchange(exchange_name);
  }
  @Bean
  public Binding binding(){
      return BindingBuilder.bind(queue()).to(exchange()).with(routing_key);
  }
  @Bean
  public MessageConverter messageConverter(){
      return new Jackson2JsonMessageConverter();
  }
  @Bean
  public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
      RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
      rabbitTemplate.setMessageConverter(messageConverter());
      return rabbitTemplate;
  }
}
