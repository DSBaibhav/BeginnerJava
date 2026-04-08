import java.util.Scanner;
public class SumNnos{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);              //Scanner class to take user input
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;         //sum=sum+i; Sum up until n natural numbers
        }
        System.out.println("The sum of first"+n+"natural numbers is:"+sum);
        sc.close();
    }
}