package oops;
public class Car {
    String color;
    String brand;

    static void start() {
        System.out.println("Car started");
    }
    public static void main(String args[]){
        Car car1 = new Car();
        car1.color = "Red";
        car1.brand = "Toyota";
        System.out.println("Car color: " + car1.color);
        System.out.println("Car brand: " + car1.brand);
        start();
    }
}