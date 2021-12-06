package chapterThree;

public class InvoiceTest{

    public static void main(String... args){

        Invoice invoice1 = new Invoice("001", "Journal", 15, 56.00);
        Invoice invoice2 = new Invoice("002", "Book", 10, 76.00);

        invoice1.setPartNumber("015");
        System.out.printf("The PartNumber is %s%n", invoice1.getPartNumber());

        invoice1.setDescription("Machinery");

        System.out.printf("after setting description, description is: %s%n", invoice1.getDescription());

        invoice2.setQuantity(90);
        invoice2.setPrice(560);

        System.out.printf("the quantity is: %.2f%n", invoice2.getInvoiceAmount());


    }
}
