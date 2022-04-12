package telran.pulse.monitoring.service;

import java.time.LocalDateTime;

public interface SensorValuesService {
    int getAverageDates (String sensorId, LocalDateTime from, LocalDateTime to);
    int getJumpsCountDates (String sensorId, LocalDateTime from, LocalDateTime to);
}
