package practice.Hospital;

public class Doctor extends User {
    private int doctorId ;
    private String doctorName;
    private int checkPatient;

    public Doctor(Patient patient){
        checkPatient = patient.getPatientId();
    }
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getCheckPatient() {
        return checkPatient;
    }

    public void setCheckPatient(Patient patient) {
        System.out.println(patient.getPatientId() + patient.getPatientName());
      checkPatient = patient.getPatientId();
    }
}
