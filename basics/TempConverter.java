import java.util.Scanner;
 public class TempConverter {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter temperature: ");
         double temp= sc.nextDouble();
         System.out.println("Enter the unit (C/F/K)");
         char unit=sc.next().charAt(0);
         if(unit == 'C' || unit == 'c')
         {
            double fahrenheit=(temp*9/5)+32;
            double kelvin=temp+273.15;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            System.out.println("Temperature in Kelvin: " + kelvin);
         }
         else if(unit == 'F' || unit == 'f')
         {
            double celsius=(temp-32)*5/9;
            double kelvin=celsius+273.15;
            System.out.println("Temperature in Celsius: " + celsius);
            System.out.println("Temperature in Kelvin: " + kelvin);  
         }
         else if(unit == 'K' || unit =='k')
         {
            double celsius=temp-273.15;
            double farenheit=(celsius*9/5)+32;
            System.out.println("Temperature in Celsius: " + celsius);
            System.out.println("Temperature in Fahrenheit: " + farenheit);
         }
         else{
            System.out.println("Invalid unit entered. Please enter C, F, or K.");
         }
         sc.close();
     }
 }