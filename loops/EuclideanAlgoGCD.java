import java.util.Scanner;
public class EuclideanAlgoGCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2=sc.nextInt();
        int a=num1;int b=num2;
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.printf("The GCD of %d and %d is %d",a,b,num1);
        sc.close();
    }
}