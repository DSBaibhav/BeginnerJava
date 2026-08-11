package oops;
class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a square");
    }
}
public class OverridingDemo2{
    public static void main(String args[]){
        Shape s=new Circle();
        s.draw(); // Output: Drawing a circle
        s=new Square();
        s.draw(); // Output: Drawing a square
    }
}
