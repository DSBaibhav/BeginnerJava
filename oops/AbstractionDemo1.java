package oops;
abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
    @Override
    void stop() {
        System.out.println("Car is stopping with brakes.");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike is starting with a button.");
    }
    @Override
    void stop() {
        System.out.println("Bike is stopping with brakes.");
    }
}
public class AbstractionDemo1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}