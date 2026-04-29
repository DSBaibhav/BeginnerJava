import java.util.Scanner;
public class DecToBin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n=sc.nextInt();
        String binary="";
        while(n>0){
            int rem=n%2;
            binary=rem+binary;     // Prepend the remainder to the binary string
            n=n/2;                 // Update n to the quotient for the next iteration
        }
        System.out.println("The binary representation is: "+binary);
        sc.close();
    }
}