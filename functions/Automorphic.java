import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        isAutomorphic(n);
        sc.close();
    }
    public static void isAutomorphic(int n){
        int sq=n*n;
        if(n == sq%Math.pow(10, String.valueOf(n).length())){
            System.out.println(n+" is an Automorphic number.");
        }
        else{
            System.out.println(n+" is not an Automorphic number.");
        }
    }
}