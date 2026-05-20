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
    public static int convertTemp(double temp,char unit){
        if(unit=='c' || unit=='C'){
            return (int)((temp * 9/5) + 32);
        }else if(unit=='f' || unit=='F'){
            return (int)((temp - 32) * 5/9);
        }else{
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            return 0;
        }
    }
}