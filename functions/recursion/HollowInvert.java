import java.util.Scanner;

public class HollowInvert{
    
    public static void printHollowInvertedNumberPyramid(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        int spaces = currentRow;
        int numbers = 2 * (n - currentRow) - 1;
        
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        
        if (currentRow == 0 || currentRow == n - 1) {
            for (int i = 0; i < numbers; i++) {
                System.out.print(i + 1);
            }
        } else {
            System.out.print("1");
            for (int i = 0; i < numbers - 2; i++) {
                System.out.print(" ");
            }
            System.out.print(n - currentRow);
        }
        
        System.out.println();
        
        printHollowInvertedNumberPyramid(n, currentRow + 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer!");
                return;
            }
            
            System.out.println("\nHollow Inverted Number Pyramid with " + n + " rows:");
            printHollowInvertedNumberPyramid(n, 0);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}