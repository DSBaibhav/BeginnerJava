import java.util.Scanner;
public class AreaCircFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        double radius=sc.nextDouble();
        double area=circle(radius);
        System.out.println("Area of the circle: " + area);
        sc.close();
    }
    public static int circle(double radius){
        return (int)(Math.PI*radius*radius);
    }
}