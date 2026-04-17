/*A right angled triangular array of natural numbers,named after Robert W.Floyd.It is constructed
by filling rows with consecutive integers starting with 1 in top-left corner,where the nth row
contains n numbers.*/
import java.util.Scanner;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int r=sc.nextInt();
        int num=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
