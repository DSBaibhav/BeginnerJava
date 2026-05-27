import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome.");
        }else{
            System.out.println(num + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int num){
        int originalNum=num;
        int revNum=0;
        while(num>0){
            int digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
        return originalNum==revNum;
    }
}