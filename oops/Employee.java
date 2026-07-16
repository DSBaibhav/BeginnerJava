package oops;
public class Employee {
    int id;
    String name;
    double basic_salary;
    double HRA;
    double DA;
    double gross_salary;
    //double gross_salary;
    void input(int id,String name,double basic_salary){
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
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.input(101, "John", 50000);
        e1.calculateSalary();
        e1.display();
        e2.input(102, "Alice", 60000);
        e2.calculateSalary();
        e2.display();
    }
}