package oops;
import java.util.Scanner;
class Student1{
    String name;
    int roll;
    String course;
    // Default constructor
    Student1(){
        name="Unknown";
        roll=0;
        course="Not Assigned";
    }
    //Constructor with one parameter
    Student1(String name){
        this.name=name;
        roll=0;
        course="Not Assigned";
    }
    //Constructor with two parameters
    Student1(String name,int roll){
        this.name=name;
        this.roll=roll;
        course="Not Assigned";
    }
    //Constructor with three parameters
    Student1(String name,int roll,String course){
        this.name=name;
        this.roll=roll;
        this.course=course;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Course: "+course);
    }
}
public class StudentConstructor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter roll number:");
        int roll=sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter course:");
        String course=sc.nextLine();
        
        Student1 s1=new Student1();
        Student1 s2=new Student1(name);
        Student1 s3=new Student1(name,roll);
        Student1 s4=new Student1(name,roll,course);
        
        System.out.println("\nStudent 1 details:");
        s1.display();
        
        System.out.println("\nStudent 2 details:");
        s2.display();
        
        System.out.println("\nStudent 3 details:");
        s3.display();
        
        System.out.println("\nStudent 4 details:");
        s4.display();
        sc.close();
    }
}
