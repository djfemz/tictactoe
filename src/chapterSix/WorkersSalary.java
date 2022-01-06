package chapterSix;

public class WorkersSalary {
    public static void main(String[] args) {
        int [] workersSalary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        System.out.println("Workers' Salary");

        for (int salary =2; salary < workersSalary.length ; salary++){
            if (salary == 10)
                System.out.printf("%5d: %d", 1000, salary);
             else
            System.out.printf("%02d-%02d: %d\n", salary * 100, salary * 100 + 9,salary);
        }
//        for (int i : workersSalary) {
//            System.out.println(i);
//        }
    }
}
