package oops;
//Parent class
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
//Child class
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
public class OverridingDemo{
    public static void main(String args[]){
        Animal a=new Dog();
        a.sound(); // Output: Dog barks
        a=new Cat();
        a.sound(); // Output: Cat meows
    }

}