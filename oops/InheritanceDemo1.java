package oops;
//Java program to demonstrate constructor inheritance
class InheritanceDemo1 {
    public static void main(String[] args){
        Student s = new Student();  // Creating object of Student class
    }
}
class Person{
    Person(){
        System.out.println("Person constructor called");
    }
}
class Student extends Person{
    Student(){
        System.out.println("Student constructor called");
    }
}