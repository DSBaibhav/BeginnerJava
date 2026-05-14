import java.util.Scanner;
public class EvenOddFunc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num!=0){
           boolean val=evenodd(num);
           if(val){
              System.out.println(num+" is an even number.");
            }
           else{
              System.out.println(num+" is an odd number.");
            }
        }
        else{
            System.out.println("Zero is neither even nor odd.");
        }
        sc.close();
    }
    static boolean evenodd(int n){
        return n%2==0;
    } 
}