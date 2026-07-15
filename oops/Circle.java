package oops;
public class Circle{
    private double radius;
    private String color;
    void setRadius(double r){
        radius = r;
    }
    void setColor(String c){
        color = c;
    }
    void display(){
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Color of Circle: " + color);
    }
    void Area(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    void Perimeter(){
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
    public static void main(String[] args){
        Circle c=new Circle();
        c.setRadius(5);
        c.setColor("Red");
        c.display();
        c.Area();
        c.Perimeter();
    }
}