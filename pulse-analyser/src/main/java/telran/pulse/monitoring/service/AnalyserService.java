package telran.pulse.monitoring.service;

import java.util.*;
import java.util.function.Consumer;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import telran.pulse.monitoring.dto.Sensor;

@Service
public class AnalyserService {
	static Logger LOG = LoggerFactory.getLogger(AnalyserService.class);
	@Autowired
	StreamBridge streamBridge;

	@Bean
	Consumer<Sensor> pulseConsumer() {
		return this::pulseProcessing;
	}

	void pulseProcessing(Sensor sensor) {
		LOG.trace("Received sensor id {}; value {} ", sensor.id, sensor.value);
		
	}

}
