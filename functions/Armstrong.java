import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println(num+" is an Armstrong number.");
        }else{
            System.out.println(num+" is not an Armstrong number.");
        }
        sc.close();
    }
    public static int getDigits(int n){
        return String.valueOf(n).length();
    }
    public static int sumOfDigits(int n,int digits){
        if(n==0){
            return 0;
        }
        int last =n%10;
        return (int)(Math.pow(last, digits)+sumOfDigits(n/10, digits));
    }
    public static boolean isArmstrong(int num){
        int n=getDigits(num);
        return num==sumOfDigits(num,n);
    }
}