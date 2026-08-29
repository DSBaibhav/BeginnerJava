package oops;
import java.util.Scanner;
abstract class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    void calculateSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    double hours;
    double hourlyRate;

    PartTimeEmployee(String name, double hours, double hourlyRate) {
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateSalary() {
        double salary = hours * hourlyRate;

        System.out.println("Employee Name: " + name);
        System.out.println("Part-Time Salary: " + salary);
    }
}
public class AbstractionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full-Time Employee Name: ");
        String fullTimeName = sc.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = sc.nextDouble();
        System.out.print("Enter Part-Time Employee Name: ");
        String partTimeName = sc.nextLine();
        System.out.print("Enter Hours Worked: ");
        double hours = sc.nextDouble();
        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = sc.nextDouble();
        Employee e1 = new FullTimeEmployee(fullTimeName, monthlySalary);
        Employee e2 = new PartTimeEmployee(partTimeName, hours, hourlyRate);

        e1.calculateSalary();
        System.out.println();

        e2.calculateSalary();
    }
}