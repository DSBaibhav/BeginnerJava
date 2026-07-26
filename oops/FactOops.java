package oops;
import java.util.Scanner;
public class FactOops {
    static int fact;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find its factoria:");
        int num=sc.nextInt();
        FactOops ob=new FactOops();
        fact=ob.factorial(num);
        ob.display(num);
        sc.close();
    }
    public int factorial(int n){
        return (n==0 || n==1) ? 1 : n*factorial(n-1);
    }
    public void display(int n){
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}