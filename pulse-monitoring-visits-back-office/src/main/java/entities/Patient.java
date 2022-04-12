package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Patient() {
    }
}
