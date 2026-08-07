package oops;
import java.util.Scanner;
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
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();
        System.out.print("Enter the length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        Area obj = new Area();

        obj.area(side);          // Square
        obj.area(length, breadth);       // Rectangle
        obj.area(radius);        // Circle
        sc.close();
    }
}