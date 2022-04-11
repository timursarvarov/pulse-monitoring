package telran.pulse.monitoring.dto;

public class VisitData {
public int patientId;
public String patientName;
public String doctorName;
public String visitDate;
public VisitData() {
}
public VisitData(int patientId, String patientName, String doctorName, String visitDate) {
	this.patientId = patientId;
	this.patientName = patientName;
	this.doctorName = doctorName;
	this.visitDate = visitDate;
}

}
