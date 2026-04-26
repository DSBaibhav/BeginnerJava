import java.util.Scanner;
public class KrishnaMurthyNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int sum=0,temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        System.out.println("Sum of factorials: "+sum);
        if(num==sum){
            System.out.println(num+" is a Krishna Murthy Number");
        }else{
            System.out.println(num+" is not a Krishna Murthy Number");
        }
        sc.close();
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}