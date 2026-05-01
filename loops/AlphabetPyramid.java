import java.util.Scanner;
public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            char ch='A';
            for(int j=1;j<=r-i;j++){            // This loop is used to print spaces before the characters in each row to create a pyramid shape
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){          // 2*i-1 is used to print odd number of characters in each row
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}