package telran.pulse.monitoring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    String email;
    String name;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Doctor(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Doctor() {
    }
}
