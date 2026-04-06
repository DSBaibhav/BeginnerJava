import java.util.Scanner;
public class NumberChecker
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive Number");
        }
        else if(num<0)
        {
            System.out.println("Negative number");
        }
        else{
            System.out.println("The given number is zero");
        }
        sc.close();
    }
}