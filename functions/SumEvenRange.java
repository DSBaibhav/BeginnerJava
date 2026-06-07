import java.util.Scanner;
public class SumEvenRange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of the range : ");
        int start=sc.nextInt();
        System.out.print("Enter the end of the range : ");
        int end=sc.nextInt();
        sumEvenRange(start, end);
        sc.close();
    }
    public static void sumEvenRange(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if((i&1)==0){
                sum+=i;
            }
        }
        System.out.println("The sum of even numbers in the range "+start+" to "+end+" is : "+sum);
    }
}