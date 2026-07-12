package oops;
public class Student{
    String name;
    int rollNo;
    int marks;
    void input(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void display(){
        System.out.println("Student details displayed");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
    public static void main(String args[]){
        Student s1=new Student();
        s1.input("John", 28, 90);
        s1.display();
    }
}