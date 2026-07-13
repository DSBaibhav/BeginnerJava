package oops;
public class Rectangle{
    int length;
    int breadth;
    void input(int  length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void area(){
        int area=length*breadth;
        System.out.println("Area of rectangle is: "+area);
    }
    void perimeter(){
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.input(5, 10);
        r1.area();
        r1.perimeter();
    }
}