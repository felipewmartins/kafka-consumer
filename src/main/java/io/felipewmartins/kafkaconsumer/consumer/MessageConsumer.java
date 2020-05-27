package io.felipewmartins.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageConsumer {

	@KafkaListener(topics = "messageTopic", groupId = "${spring.kafka.consumer.group-id}")
	public void consumer(String message) {
		log.info("Message: " + message);
	}
}
