package telran.pulse.monitoring.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;

@RedisHash
public class SensorList {

    @Id
    int id;
    ArrayList<Integer> listValues = new ArrayList<>();

    public SensorList(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getListValues() {
        return listValues;
    }

}
