import java.util.Scanner;
public class SquareFunc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int square=square(num);
        System.out.println("The square is: "+square);
        sc.close();
    }
    public static int square(int s){
        return s*s;
    }
}