import java.util.Scanner;
public class Strong{
    public static boolean isStrong(int num){
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        return sum==num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(isStrong(n)){
            System.out.println(n+" is a strong number.");
        }
        else{
            System.out.println(n+" is not  a strong number.");
        }
        sc.close();
    }
}