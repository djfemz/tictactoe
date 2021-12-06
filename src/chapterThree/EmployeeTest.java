package chapterThree;
public class EmployeeTest{

    public static void main(String... args){

        Employee employee1 = new Employee("Jacinta", "Esther", (-23.00));
        Employee employee2 = new Employee("Jay", "Est", 140.00);

        System.out.printf("the monthly salary of %s, %s is %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getsalary());

        System.out.printf("the monthly salary of %s, %s is %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getsalary());


        System.out.printf("the yearly salary of %s, %s is %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
        System.out.printf("the yearly salary of %s, %s is %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());

        employee1.setsalary(278.00);
        System.out.printf("the monthly salary of %s, %s is %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getsalary());
        System.out.printf("the yearly salary of %s, %s is %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());


        System.out.printf("the monthly salary of %s, %s is %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getSalaryRaise());
        System.out.printf("the monthly salary of %s, %s is %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getSalaryRaise());


        System.out.printf("the yearly salary of %s, %s is %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalaryRaise());
        System.out.printf("the yearly salary of %s, %s is %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalaryRaise());



    }
}
