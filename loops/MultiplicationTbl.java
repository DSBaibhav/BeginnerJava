import java.util.Scanner;
public class MultiplicationTbl{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to print its multiplication table:");
        int n=sc.nextInt();
        System.out.println("Multiplication table of "+n+" is:");
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
}