import java.util.Scanner;
public class Perfect {
    public static boolean isPerfect(int num){
        int sum=1;      //To store the sum of divisors of num
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                if(i*i!=num){
                    sum+=i+num/i;
                }
                else
                    sum+=i;
            }
        }
        //If sum of divisors is equal to num, then num is a perfect number
        return sum==num && num!=1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(isPerfect(n)){
            System.out.println(n+" is a perfect number.");
        }else{
            System.out.println(n+" is not a perfect number.");
        }
        sc.close();
    }
}