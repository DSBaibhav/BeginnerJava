package oops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Enter operation (+, -, *, /):");
        char operation=sc.next().charAt(0);
        switch(operation){
            case '+':
                add(num1,num2);
                break;
            case '-':
                subtract(num1,num2);
                break;
            case '*':
                multiply(num1,num2);
                break;
            case '/':
                if(num2!=0){
                    divide(num1,num2);
                }else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
        sc.close();
    }
    public static void add(int a,int b){
        int result=a+b;
        System.out.println("Result: "+result);
    }
    public static void subtract(int a,int b){
        int result=a-b;
        System.out.println("Result: "+result);
    }
    public static void multiply(int a,int b){
        int result=a*b;
        System.out.println("Result: "+result);
    }
    public static void divide(int a,int b){
        double result=(double)a/b;
        System.out.println("Result: "+result);
    }
}
