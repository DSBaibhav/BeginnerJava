import java.util.Scanner;
public class TempFunc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature :");
        double temp=sc.nextDouble();
        System.out.print("Enter the unit (C/F) :");
        char unit=sc.next().charAt(0);
        double convertedTemp=convertTemp(temp, unit);
        System.out.println("Converted temperature: " + convertedTemp);
        sc.close();
    }
    public static double convertTemp(double temp,char unit){
        if(unit=='C' || unit=='c'){
            return (temp * 9/5) + 32; // Convert Celsius to Fahrenheit
        } else if(unit=='F' || unit=='f'){
            return (temp - 32) * 5/9; // Convert Fahrenheit to Celsius
        } else {
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            return Double.NaN; // Return NaN for invalid input
        }
    }
}