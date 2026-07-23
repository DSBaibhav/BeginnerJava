package oops;
import java.util.Scanner;
public class Laptop{
    String brand;
    String model;
    double price;
    Laptop(){
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
        System.out.println("Default constructor called");
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
    }
    Laptop(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
        System.out.println("Parameterized constructor called");
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
    }
    Laptop(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println("Parameterized constructor with price called");
        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand:");
        String brand = sc.nextLine();
        System.out.print("Enter model:");
        String model = sc.nextLine();
        System.out.print("Enter price:");
        double price = sc.nextDouble();
        Laptop l = new Laptop(brand, model, price);
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop(brand, model);
    }
}