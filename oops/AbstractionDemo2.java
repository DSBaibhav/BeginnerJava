package oops;

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

        Employee e1 = new FullTimeEmployee("Baibhav", 50000);
        Employee e2 = new PartTimeEmployee("Joseph", 80, 500);

        e1.calculateSalary();
        System.out.println();

        e2.calculateSalary();
    }
}