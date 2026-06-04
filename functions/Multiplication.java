import java.util.Scanner;
public class Multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int c=1;
        System.out.println("Multiplication table of "+n+" is : ");
        multiplicationTable(n,c);
        sc.close();
    }
    public static void multiplicationTable(int n, int c){
        if(c<=10){
            System.out.println(n+" x "+c+" = "+(n*c));
            multiplicationTable(n,c+1);
        }
    }
}