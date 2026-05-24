import java.util.Scanner;
public class AreaRect{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        int l=sc.nextInt();
        System.out.print("Enter the breadth of rectangle :");
        int b=sc.nextInt();
        int ar=area(l,b);
        System.out.println("The area of rectangle :"+ar);
        sc.close();
    }
    public static int area(int len,int bdth)
    {
        return len*bdth;
    }
}