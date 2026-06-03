import java.util.Scanner;
public class LargeSmallDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int l=largestDigit(n);
        int s=smallestDigit(n);
        System.out.println("Largest digit in "+n+" is : "+l);
        System.out.println("Smallest digit in "+n+" is : "+s);
        sc.close();
    }
    public static int largestDigit(int number){
        int largest=0;
        while(number != 0){
            int digit=number%10;
            if(digit>largest){
                largest=digit;
            }
            number/=10;
        }
        return largest;
    }
    public static int smallestDigit(int number){
        int smallest=9;
        while(number != 0){
            int digit=number%10;
            if(digit<smallest){
                smallest=digit;
            }
            number/=10;
        }
        return smallest;
    }
}