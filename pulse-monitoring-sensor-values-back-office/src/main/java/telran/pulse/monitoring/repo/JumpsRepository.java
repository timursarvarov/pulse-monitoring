package telran.pulse.monitoring.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import telran.pulse.monitoring.entities.SensorDoc;

import java.time.LocalDateTime;


public interface JumpsRepository  extends MongoRepository<SensorDoc, ObjectId> {
    long countBySensorIdAndDateTimeBetween(int sensorId, LocalDateTime from, LocalDateTime to);
}
