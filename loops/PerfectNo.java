import java.util.Scanner;
public class PerfectNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int cpy=num;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==cpy){
            System.out.println(cpy+" is a perfect number.");
        }
        else{
            System.out.println(cpy+" is not a perfect number.");
        }
        sc.close();
    }
}