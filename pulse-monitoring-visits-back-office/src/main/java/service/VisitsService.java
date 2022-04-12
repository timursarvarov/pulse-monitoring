package service;

import java.time.LocalDateTime;

public interface VisitsService {
    void addPatient (int patientId, String name);
    void addDoctor (String email, String name);
    void addVisit (int patientId, String email, LocalDateTime dateTime);
}
