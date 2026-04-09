import java.util.Scanner;
public class PalindromeNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int originalNum=num;     //Store the original number in a variable
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;     //Reverse the number
            num=num/10;            //Remove the last digit from the number
        }
        if(originalNum ==rev){
            System.out.println("The number "+originalNum+" is a palindrome.");
        }else{
            System.out.println("The number "+originalNum+" is not a palindrome.");
        }
        sc.close();
    }
}