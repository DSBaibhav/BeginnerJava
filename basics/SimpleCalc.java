import java.util.Scanner;
public class SimpleCalc
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/):");
        char opr=sc.next().charAt(0);
        switch(opr)
        {
            case '+':
                System.out.println("The sum is: "+(num1+num2));
                break;
            case '-':
                System.out.println("The difference is: "+(num1-num2));
                break;
            case '*':
                System.out.println("The product is: "+(num1*num2));
                break;
            case '/':
                if(num2!=0)
                    System.out.println("The quotient is:"+(num1/num2));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default:
                System.out.println("Entered operator is not valid!");
        }
    }
}