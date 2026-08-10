package oops;
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter third number: ");
        int num3=sc.nextInt();
        Max m = new Max();
        int max=m.max(num1, num2, num3);
        System.out.println("Maximum of three numbers is: "+max);
        sc.close();
    }
}
class Max{
    public int max(int a,int b,int c){
        int max;
        if(a>=b && a>=c){
            max=a;
        }
        else if(b>=a && b>=c){
            max=b;
        }
        else{
            max=c;
        }
        return max;
    }
}
