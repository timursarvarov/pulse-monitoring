package entities;

import java.time.LocalDateTime;

@Entity
@Table(name = "visit")
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    LocalDateTime date;
    @JoinColumn(name="doctor")
    @ManyToOne
    Doctor doctor;
    @JoinColumn(name="patient_id")
    @ManyToOne
    Patient patient;

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Visit(LocalDateTime date, Doctor doctor, Patient patient) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Visit() {
    }
}