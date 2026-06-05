import java.util.Scanner;
public class PrimeInRange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start=sc.nextInt();
        System.out.print("Enter the ending number : ");
        int end=sc.nextInt();
        System.out.println("Prime numbers between "+start+" and "+end+" are : ");
        primeInRange(start,end);
        sc.close();
    }
    public static void primeInRange(int start,int end){
        if(start<=end){
            int count=0;
            for(int i=2;i<=start/2;i++){
                if(start%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(start+" ");
            }
            primeInRange(start+1,end);
        }
    }
}