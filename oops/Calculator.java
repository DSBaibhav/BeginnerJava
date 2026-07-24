package oops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Creating object of Calculator class
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + calc.add(num1, num2));
        System.out.println("Subtraction = " + calc.subtract(num1, num2));
        System.out.println("Multiplication = " + calc.multiply(num1, num2));
        System.out.println("Division = " + calc.divide(num1, num2));

        sc.close();
    }
    public int  add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(int a,int b){
        if(b==0){
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double)a/b;
    }
}
