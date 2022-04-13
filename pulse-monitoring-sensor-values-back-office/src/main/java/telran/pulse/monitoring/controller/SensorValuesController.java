package telran.pulse.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/sensors")
public class SensorValuesController {
    @GetMapping("/average/{sensorId}")
    int getAverageSensorDates(@PathVariable int sensorId, LocalDateTime from, LocalDateTime to) {
        return 0;
    }

}

