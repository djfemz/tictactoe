package practice.Hospital;

public class Receptionist extends User {

    private int receptionistId;
    private String receptionistName;

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public void giveAppointment(){

    }

    public void generateBill(Billing bills, Patient patient){

        System.out.println("-".repeat(20));
        System.out.println(patient.getPatientName());
        System.out.println(bills.getBillingAmount() + patient.getPatientId());

    }


}
