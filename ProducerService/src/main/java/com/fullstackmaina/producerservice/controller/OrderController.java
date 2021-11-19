package com.fullstackmaina.producerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstackmaina.producerservice.model.Order;
import com.fullstackmaina.producerservice.service.KafkaProducerService;

@RestController
public class OrderController {

	@Autowired
	private KafkaProducerService kafkaProducerService;

	@PostMapping("/post")
	public void order(@RequestBody Order order) {
		kafkaProducerService.send(order);
	}

}
