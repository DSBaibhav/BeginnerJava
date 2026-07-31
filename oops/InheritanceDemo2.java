package oops;
class Vehicle{
    char fuelType;
    int maxSpeed;
    void display(){
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
    }
}
class Car extends Vehicle{
    int numDoors;
    @Override
    void display(){
        super.display(); // Call the display method of Vehicle class
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Bike extends Vehicle{
    boolean hasCarrier;
    @Override
    void display(){
        super.display(); // Call the display method of Vehicle class
        System.out.println("Has Carrier: " + hasCarrier);
    }
}
class InheritanceDemo2 {
    public static void main(String[] args){
        Car car = new Car();
        car.fuelType = 'P';
        car.maxSpeed = 200;
        car.numDoors = 4;
        System.out.println("Car Details:");
        car.display(); // Display details of the car

        System.out.println();

        Bike bike = new Bike();
        bike.fuelType = 'D';
        bike.maxSpeed = 100;
        bike.hasCarrier = true;
        System.out.println("Bike Details:");
        bike.display(); // Display details of the bike
    }
}