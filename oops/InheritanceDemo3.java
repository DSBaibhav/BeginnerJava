package oops;
import java.util.Scanner;
class Vehicle1{
    Vehicle1(String fuelType, int maxSpeed){
        System.out.println("Vehicle Details:");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
    }
}
class Truck extends Vehicle1{
    Truck(String fuelType, int maxSpeed){
        super(fuelType, maxSpeed); // Call the constructor of Vehicle class
        System.out.println("Vehicle Type: Truck");
        System.out.println("Load Capacity: 1000 kg");
    }
}
class InheritanceDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fuel type for the vehicle:");
        String fuelType = sc.nextLine();
        System.out.print("Enter the maximum speed for the vehicle:");
        int maxSpeed = sc.nextInt();
        Truck t = new Truck(fuelType, maxSpeed); // Create an instance of Truck
    }
}