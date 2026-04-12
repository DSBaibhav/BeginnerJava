import java.util.Scanner;
public class PrintPrimes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int lim=sc.nextInt();
        System.out.println("Prime numbers up to "+lim+" are:");
        for(int num=2;num<=lim;num++){
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+", ");
            }
        }
        sc.close();
    }
}