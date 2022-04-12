package telran.pulse.monitoring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import telran.pulse.monitoring.entities.Patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
