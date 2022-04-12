package telran.pulse.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import telran.pulse.monitoring.dto.DoctorPatientData;
import telran.pulse.monitoring.repo.DoctorRepository;
import telran.pulse.monitoring.repo.PatientRepository;
import telran.pulse.monitoring.repo.VisitRepository;

import static telran.pulse.monitoring.api.ApiConstants.*;

@RestController
public class DoctorDataProviderController {
    public DoctorDataProviderController(DoctorRepository doctorRepository, PatientRepository patientRepository, VisitRepository visitRepository) {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.visitRepository = visitRepository;
    }

    DoctorRepository doctorRepository;
    PatientRepository patientRepository;
    VisitRepository visitRepository;

    @GetMapping(value = DOCTOR_PATIENT_DATA_URL + "{id}")
    DoctorPatientData getDoctorPatientData(@PathVariable("id") int id) {
        String email = visitRepository.getDoctorEmail(id);
        String doctorName = doctorRepository.getById(email).getName();
        String patientName = patientRepository.getById(id).getName();
        return new DoctorPatientData(doctorName, patientName, email);
    }

}
