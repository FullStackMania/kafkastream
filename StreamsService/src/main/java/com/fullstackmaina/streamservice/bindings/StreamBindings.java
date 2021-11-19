package com.fullstackmaina.streamservice.bindings;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.core.annotation.Order;

public interface StreamBindings {

	KStream<String, Order> inputOrderStream();

	KStream<String, Order> takeAwayStream();

	KStream<String, Order> homeDeiveryStream();

}
