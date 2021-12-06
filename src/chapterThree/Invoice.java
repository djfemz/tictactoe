package chapterThree;

public class Invoice{


    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String PartNumber, String Description, int Quantity, double Price){

        this.partNumber = partNumber;
        this.description = description;
        this.quantity= quantity;
        this.price = price;


        if (quantity < 0){
            quantity= 0;
            this.quantity = quantity;
        }

        if (price < 0) {
            price= 0.0;
            this.price = price;
        }
    }


    public String getPartNumber(){
        return partNumber;
    }


    public void setPartNumber(String newPartNumber){
        this.partNumber= newPartNumber;
    }


    public String getDescription(){
        return description;
    }


    public void setDescription(String newDescription){
        this.description= newDescription;
    }


    public void setQuantity(int newQuantity){
        this.quantity= newQuantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double newPrice){
        this.price=newPrice;
    }


    public double getPrice(){
        return price;
    }


    public double getInvoiceAmount()
    {
        double invoiceAmount = (quantity*price);
        return invoiceAmount;
    }
}
