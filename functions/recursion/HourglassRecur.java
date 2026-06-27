import java.util.Scanner;

public class HourglassRecur{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the size of hourglass (number of rows): ");
        int n = sc.nextInt();
        
        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        System.out.println("\nHollow Hourglass Pattern (Size: " + n + "):\n");
        printHollowHourglass(n);
        
        sc.close();
    }
    
    // Main method to print hollow hourglass
    public static void printHollowHourglass(int n) {
        // Print upper half (including middle row)
        printUpperHalf(n, 1);
        // Print lower half (excluding middle row)
        printLowerHalf(n, 2);
    }
    
    // Print upper half of hourglass (top to middle)
    private static void printUpperHalf(int n, int row) {
        // Base case: if row exceeds n, stop
        if (row > n) return;
        
        // Print leading spaces
        printSpaces(row - 1);
        
        // Print stars and hollow spaces
        if (row == 1) {
            // Top row - full line
            printStars(2 * n - 1);
        } else if (row == n) {
            // Middle row - single star or full line
            if (n % 2 == 1) {
                printStars(1);
            } else {
                // For even n, middle row has 2 stars with space between
                System.out.print("*");
                printSpaces(1);
                System.out.print("*");
            }
        } else {
            // Hollow part - two stars with spaces in between
            System.out.print("*");
            printSpaces(2 * (n - row + 1) - 3);
            System.out.print("*");
        }
        
        System.out.println();
        
        // Recursive call for next row
        printUpperHalf(n, row + 1);
    }
    
    // Print lower half of hourglass (below middle to bottom)
    private static void printLowerHalf(int n, int row) {
        // Base case: if row exceeds n, stop
        if (row > n) return;
        
        // Print leading spaces
        printSpaces(n - row);
        
        // Print stars and hollow spaces
        if (row == n) {
            // Bottom row - full line
            printStars(2 * n - 1);
        } else if (row == 1) {
            // This case won't execute as we start from row=2
            // But keeping for completeness
            if (n % 2 == 1) {
                printStars(1);
            } else {
                System.out.print("*");
                printSpaces(1);
                System.out.print("*");
            }
        } else {
            // Hollow part - two stars with spaces in between
            System.out.print("*");
            printSpaces(2 * row - 3);
            System.out.print("*");
        }
        
        System.out.println();
        
        // Recursive call for next row
        printLowerHalf(n, row + 1);
    }
    
    // Recursive method to print stars
    private static void printStars(int count) {
        if (count <= 0) return;
        System.out.print("*");
        printStars(count - 1);
    }
    
    // Recursive method to print spaces
    private static void printSpaces(int count) {
        if (count <= 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }
}