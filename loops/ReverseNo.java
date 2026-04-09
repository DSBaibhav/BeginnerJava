import java.util.Scanner;
public class ReverseNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");    //Taking user input through Scanner class
        int n=sc.nextInt();
        int temp=n;    //Storing the original number in a temporary variable
        int rev=0;
        while(n!=0){
            int rem=n%10;     //Extracting the last digit of the number
            rev=rev*10+rem;   //Reversing the number by multiplying the previous reverse by 10 and adding the last digit
            n/=10;            //Removing the last digit from the original number
        }
        System.out.println("The reverse of the number "+temp+" is "+rev);
        sc.close();
    }
}