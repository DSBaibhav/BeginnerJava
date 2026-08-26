package oops;
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike is starting with a button.");
    }
}
public class AbstractionDemo1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Bike bike = new Bike();
        bike.start();
    }
}