package oops;

class Area {

    // Area of Square
    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    // Area of Rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    // Area of Circle
    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14159 * radius * radius));
    }
}

public class AreaOverloading {
    public static void main(String[] args) {

        Area obj = new Area();

        obj.area(5);          // Square
        obj.area(8, 4);       // Rectangle
        obj.area(3.5);        // Circle
    }
}