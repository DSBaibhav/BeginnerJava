import java.util.Scanner;
public class PowRecur {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number : ");
        double base=sc.nextDouble();
        System.out.print("Enter the exponent : ");
        double exponent=sc.nextDouble();
        double result=calculatePower(base, exponent);
        System.out.println(base+" raised to the power of "+exponent+" is : "+result);
        sc.close();
    }
    public static double calculatePower(double b, double e){
        if(e==0){
            return 1;
        }
        return b * calculatePower(b, e-1);
    }
}