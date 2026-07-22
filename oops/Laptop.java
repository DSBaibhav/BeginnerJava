package oops;
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
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell", "XPS 13");
        Laptop l3 = new Laptop("Apple", "MacBook Pro", 1500.0);
    }
}