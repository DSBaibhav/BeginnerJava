package oops;
interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Eagle implements Animal, Bird {

    public void eat() {
        System.out.println("Eagle eats food");
    }

    public void fly() {
        System.out.println("Eagle can fly");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {

        Eagle e = new Eagle();

        e.eat();
        e.fly();
    }
}