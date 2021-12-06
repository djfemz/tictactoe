package chapterThree;
public class Employee{

    private String firstName;
    private String lastName;
    private double salary;


    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName= lastName;
        this.salary= salary;

        if (salary < 0){
            salary = 0;
            this.salary = salary;
        }
    }


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName= lastName;
    }

    public double getsalary(){
        return salary;
    }


    public void setsalary(double salary){
        this.salary= salary;
    }

    public double getYearlySalary(){
        double yearlySalary = (salary * 12);
        return yearlySalary;
    }


    public double getSalaryRaise(){
        return (getsalary() * 0.10) + getsalary();
    }

    public double getYearlySalaryRaise(){
        return getSalaryRaise() * 12;
    }
}
