import java.util.Scanner;
public class AbsFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int absValue=absolute(num);
        System.out.println("The absolute value of "+num+" is: "+absValue);
        sc.close();
    }
    public static int absolute(int n){
        if(n<0){
            return -n;
        }
        return n;
    }
}