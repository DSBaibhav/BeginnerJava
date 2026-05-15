import java.util.Scanner;
public class MaxofTwo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();
        int max=max(n1,n2);
        System.out.println("The maximum of the two numbers is: "+max);
        sc.close();
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}