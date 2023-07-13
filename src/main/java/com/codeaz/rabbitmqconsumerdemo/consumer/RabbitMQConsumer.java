package com.codeaz.rabbitmqconsumerdemo.consumer;

import com.codeaz.rabbitmqconsumerdemo.dto.OrderDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    private static final Log LOG = LogFactory.getLog(RabbitMQConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name" })
    public void receive(OrderDTO message) {
        LOG.info("receive message: " + message);
    }
}
