package oops;
import java.util.Scanner;

class IsPrime {
    // Method to check if a number is prime
    public boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}

class PrimeChecker{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IsPrime pc = new IsPrime();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (pc.isPrime(n))
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is Not a Prime Number.");

        sc.close();
    }
}

