package practice.Hospital;

public class Patient extends User {
    private Billing payBill;
    private int patientId;
    private String patientName;

    public Patient(int patientId, String patientName){
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Billing getPayBill() {
        return payBill;
    }

    public void setPayBill(Billing payBill) {
        this.payBill = payBill;
    }
}
