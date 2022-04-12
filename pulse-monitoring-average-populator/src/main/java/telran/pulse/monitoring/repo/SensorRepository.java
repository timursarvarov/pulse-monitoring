package telran.pulse.monitoring.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import telran.pulse.monitoring.entities.SensorDoc;

@Document(collection = "average_values")
public interface SensorRepository extends MongoRepository<SensorDoc, ObjectId>  {

}
