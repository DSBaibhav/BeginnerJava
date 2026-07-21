package oops;
public class Person{
    String name;
    int age;
    Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    Person(String name){
        this.name = name;
        this.age = 0;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String args[]){
        Person p1 = new Person();
        System.out.println("Name: "+p1.name);
        System.out.println("Age: "+p1.age);
        Person p2 = new Person("John");
        System.out.println("Name: "+p2.name);
        System.out.println("Age: "+p2.age);
        Person p3 = new Person("Alice", 25);
        System.out.println("Name: "+p3.name);
        System.out.println("Age: "+p3.age);
    }
}