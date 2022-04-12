package telran.pulse.monitoring.dto;

public class DoctorPatientData {
    public String name;
    public String doctorName;
    public String patientName;
    public String email;

    @Override
    public String toString() {
        return "DoctorPatientData{" +
                "name='" + name + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", patientName='" + patientName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public DoctorPatientData() {
    }

    public DoctorPatientData(String doctorName, String patientName, String email) {
        this.doctorName = doctorName;
        patientName = patientName;
        email = email;
    }
}
