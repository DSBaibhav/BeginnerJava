package oops;
class Vehicle1{
    Vehicle1(String fuelType, int maxSpeed){
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
    }
}
class Truck extends Vehicle1{
    Truck(){
        super("Diesel", 150); // Call the constructor of Vehicle class
        System.out.println("Truck Details:");
        System.out.println("Load Capacity: 1000 kg");
    }
}
class InheritanceDemo3 {
    public static void main(String[] args){
        Truck t = new Truck(); // Create an instance of Truck
    }
}