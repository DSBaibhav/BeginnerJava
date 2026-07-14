package oops;
public class Employee {
    int id;
    String name;
    double salary;
    void input(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee id is: "+id);
        System.out.println("Employee name is: "+name);
        System.out.println("Employee salary is: "+salary);  
    }
    public static void main(String args[]){
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.input(101, "John", 50000);
        e1.display();
        e2.input(102, "Alice", 60000);
        e2.display();
    }
}