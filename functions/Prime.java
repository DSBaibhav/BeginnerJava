import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        boolean isPrime=checkPrime(n,2);
        if(isPrime)
            System.out.println(n+" is a prime number.");
        else
            System.out.println(n+" is not a prime number.");
        sc.close();
    }
    public static boolean checkPrime(int num,int divisor){
        if(num <= 1)
            return false;
        if(divisor == num)
            return true;
        if(num % divisor == 0)
            return false;
        return checkPrime(num, divisor + 1);
    }
}