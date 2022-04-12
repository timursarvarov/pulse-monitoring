package telran.pulse.monitoring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import telran.pulse.monitoring.dto.DoctorData;
import telran.pulse.monitoring.dto.PatientData;
import telran.pulse.monitoring.entities.Doctor;
import telran.pulse.monitoring.service.VisitsService;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/visit")
public class VisitController {
    @Autowired
    VisitsService visitsService;
    @PostMapping("/patients")
    PatientData addPatient(@RequestBody PatientData patient) {
        visitsService.addPatient(patient.patientId, patient.patientName);
        return patient;
    }

    @PostMapping("/doctors")
    DoctorData addDoctor( @RequestBody @Valid DoctorData doctor) {
        visitsService.addDoctor(doctor.email, doctor.name);
        return doctor;
    }

    Map<String, Object> addVisit(@RequestBody Map<String, Object> visit) {
        visitsService.addVisit(()visit.get("patientId"),
                (Integer)visit.get("doctorId"),
                visit.get("date").toString(),
                visit.get("time").toString());
        return visit;
    }
}

