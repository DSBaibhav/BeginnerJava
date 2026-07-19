package oops;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    double basic_salary;
    double HRA;
    double DA;
    double gross_salary;
    Employee(int id,String name,double basic_salary){
        this.id=id;
        this.name=name;
        this.basic_salary=basic_salary;
    }
    void calculateSalary(){
        HRA=0.2*basic_salary;
        DA=0.1*basic_salary;
        gross_salary=basic_salary+HRA+DA;
    }
    void display(){
        System.out.println("Employee id is: "+id);
        System.out.println("Employee name is: "+name);
        System.out.println("Employee basic salary is: "+basic_salary); 
        System.out.println("Employee HRA is: "+HRA);
        System.out.println("Employee DA is: "+DA);
        System.out.println("Employee gross salary is: "+gross_salary);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee id: ");
        int id=sc.nextInt();
        System.out.print("Enter Employee name: ");
        String name=sc.next();
        System.out.print("Enter Employee basic salary: ");
        double basic_salary=sc.nextDouble();
        Employee e1=new Employee(id,name,basic_salary);
        e1.calculateSalary();
        e1.display();
        sc.close();
    }
}