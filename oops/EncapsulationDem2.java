package oops;
import java.util.Scanner;
class Employee{
    private String name;
    private int age;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }
}
public class EncapsulationDem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Employee Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        double salary=sc.nextDouble();
        Employee emp = new Employee();
        emp.setName(name);
        emp.setAge(age);
        emp.setSalary(salary);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
        emp.setAge(-5); // Invalid age
        emp.setSalary(-1000); // Invalid salary
    }
}