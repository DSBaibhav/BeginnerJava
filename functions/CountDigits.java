import java.util.Scanner;
public class CountDigits{
    public static int countDigits(int number){
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The number of digits in "+n+" is : "+countDigits(n));
        sc.close();
    }
}