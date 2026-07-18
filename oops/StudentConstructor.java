package oops;
class Student {
    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student() {
        rollNo = 101;
        name = "Rahul";
        marks = 89.5;
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor is called
        s1.display();
    }
}