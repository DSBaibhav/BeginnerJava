import java.util.Scanner;

public class HollowButterfly{
    
    public static void printUpperWing(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        for (int col = 0; col < 2 * n; col++) {
            if (col <= currentRow || col >= 2 * n - 1 - currentRow) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        printUpperWing(n, currentRow + 1);
    }
    
    public static void printLowerWing(int n, int currentRow) {
        if (currentRow < 0) {
            return;
        }
        
        for (int col = 0; col < 2 * n; col++) {
            if (col <= currentRow || col >= 2 * n - 1 - currentRow) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        printLowerWing(n, currentRow - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the size: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer!");
                return;
            }
            
            System.out.println("\nHollow Butterfly Star Pattern:");
            printUpperWing(n, 0);
            printLowerWing(n, n - 1);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}