import java.util.Scanner;

public class UserInp {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = sc.nextLine();
         System.out.print("Enter a number:");
         int num = sc.nextInt();
         System.out.println("Hello, " + name + "! You entered the number: " + num);
         sc.close();
    }
}