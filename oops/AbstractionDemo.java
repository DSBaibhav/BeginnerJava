package oops;
abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    double radius=5;
    @Override
    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
class Rectangle extends Shape {
    double length=10;
    double breadth=5;
    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
        Rectangle r=new Rectangle();
        r.area();
    }
}