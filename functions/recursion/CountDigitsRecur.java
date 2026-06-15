import java.util.Scanner;
public class CountDigitsRecur {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int count=countDigits(num);
        System.out.println("Number of digits in "+num+" is : "+count);
        sc.close();
    }
    public static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
}