package telran.pulse.monitoring.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public class SensorLastValues {
    @Id
    int id;
    int lastValue;

    public SensorLastValues(int id) {
        this.id = id;
    }

    public int getLastValue() {
        return lastValue;
    }

    public void setLAstValue(int value) {
        this.lastValue = value;
    }

}
