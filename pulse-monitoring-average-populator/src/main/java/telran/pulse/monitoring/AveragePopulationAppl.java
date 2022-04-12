package telran.pulse.monitoring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import telran.pulse.monitoring.dto.Sensor;
import telran.pulse.monitoring.entities.SensorDoc;
import telran.pulse.monitoring.repo.SensorRepository;

import java.util.function.Consumer;

@SpringBootApplication
public class AveragePopulationAppl {
    static Logger LOG = LoggerFactory.getLogger(AveragePopulationAppl.class);

    final
    SensorRepository sensorRepository;

    public AveragePopulationAppl(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AveragePopulationAppl.class, args);
    }

    @Bean
    Consumer<Sensor> averageConsumer() {
        return this::averageProcessing;
    }

    private void averageProcessing(Sensor sensor) {
        LOG.debug("received sensor id {} with average value: {}", sensor.id, sensor.value);
        sensorRepository.insert(SensorDoc.build(sensor));
    }
}
