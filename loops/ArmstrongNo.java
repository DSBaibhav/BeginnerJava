/*An Armstrong number is a number whose digits raised to power the number of digits and added equals 
the number itself*/
import java.util.Scanner;
public class ArmstrongNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int orgNum=num;
        int c=0, sum=0;
        while(num>0){
            num/=10;
            c++;
        }
        num=orgNum;
        while(num>0){
            int rem=num%10;
            sum+=Math.pow(rem,c);
            num/=10;
        }
        if(sum==orgNum){
            System.out.println(orgNum+" is an Armstrong number.");
        }
        else{
            System.out.println(orgNum+" is not an Armstrong number.");
        }
        sc.close();
    }
}