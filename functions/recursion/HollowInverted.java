import java.util.Scanner;

public class HollowInverted{
    
    public static void printHollowInvertedPyramid(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        int spaces = currentRow;
        int stars = 2 * (n - currentRow) - 1;
        
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        
        if (currentRow == 0 || currentRow == n - 1) {
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
        } else {
            System.out.print("*");
            for (int i = 0; i < stars - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        
        System.out.println();
        
        printHollowInvertedPyramid(n, currentRow + 1);
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
            
            System.out.println("\nHollow Inverted Pyramid with " + n + " rows:");
            printHollowInvertedPyramid(n, 0);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}