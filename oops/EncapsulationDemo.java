package oops;
import java.util.Scanner;
class Student {
    // Private fields
    /* The fields of the Student class are declared as private, 
    * which means they cannot be accessed directly from outside the class. 
     This is a key aspect of encapsulation, as it restricts direct access to the internal state of the object and allows controlled access through public methods (getters and setters). */
    private String name;
    private int age;
    private double marks;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of student");
        String name=sc.nextLine();
        System.out.println("Enter age of student");
        int age=sc.nextInt();
        System.out.println("Enter marks of student");
        double marks=sc.nextDouble();
        Student s = new Student();

        // Setting values using setters
        s.setName(name);
        s.setAge(age);
        s.setMarks(marks);

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
        sc.close();
    }
}