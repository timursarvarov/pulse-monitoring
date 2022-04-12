package telran.pulse.monitoring.dto;

import javax.validation.constraints.Email;

public class DoctorData {
    public String name;
    @Email
    public String email;
}
