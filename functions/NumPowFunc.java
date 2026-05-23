import java.util.*;
public class NumPowFunc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number :");
        double base=sc.nextDouble();
        System.out.print("Enter the exponent : ");
        double exponent=sc.nextDouble();
        double result=power(base,exponent);
        System.out.println(base+" raised to the power of "+exponent+" is: "+result);
        sc.close();
    }
    public static double power(double base,double exponent){
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        return result;
    }
}