import java.util.Scanner;
public class SwapFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();
        System.out.println("Before swapping: n1 = "+n1+", n2 = "+n2);
        swap(n1,n2);
        sc.close();
    }
    public static int swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: n1 = "+a+", n2 = "+b);
        return 0;

    }
}