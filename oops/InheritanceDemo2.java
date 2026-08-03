package oops;

import java.util.Scanner;

class Vehicle {
    void display(char fuelType, int maxSpeed) {
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    @Override
    void display(char fuelType, int maxSpeed) {
        super.display(fuelType, maxSpeed);
        System.out.println("This is a Car.");
    }
}

class SportsCar extends Car {
    @Override
    void display(char fuelType, int maxSpeed) {
        super.display(fuelType, maxSpeed);
        System.out.println("This is a Sports Car.");
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fuel Type (P/D/E): ");
        char fuelType = sc.next().charAt(0);

        System.out.print("Enter Maximum Speed: ");
        int maxSpeed = sc.nextInt();

        SportsCar s = new SportsCar();

        System.out.println("\nVehicle Details");
        s.display(fuelType, maxSpeed);

        sc.close();
    }
}