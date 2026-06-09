import java.util.Scanner;
public class OddDigitsSum {
    public static int oddDigitsSum(int number){
        int sum = 0;
        while(number != 0){
            int digit = number % 10;
            if(digit % 2 != 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The sum of odd digits in "+n+" is : "+oddDigitsSum(n));
        sc.close();
    }
}