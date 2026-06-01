import java.util.Scanner;
public class DigitsSum{
    public static int sumOfDigits(int num){
    int sum=0;
    while(num>0){
        int digit=num%10;
        sum+=digit;
        num/=10;
    }
    return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int result=sumOfDigits(n);
        System.out.println("The sum of digits of "+n+" is: "+result);
        sc.close();
    }
}