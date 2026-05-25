import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("The factorial of "+n+" is :"+fact);
        sc.close();
    }
    public static int factorial(int num){
        if(num==0 || num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
}