import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=sc.nextInt();
        if(year != 0)
        {
            if(year%4 == 0 && year%100 == 0 && year%400 == 0)
            {
                System.out.println("The given year is a leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }
        }
        else{
            System.out.println("Invalid year!!");
        }
     sc.close();
    }
}