import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0 && num!=0){
            System.out.println(num+" is an even number.");
        }
        else if(num==0){
            System.out.println(num+" is neither even nor odd.");
        }
        else{
            System.out.println(num+" is an odd number.");
        }
        sc.close();
    }
}