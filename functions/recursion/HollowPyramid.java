import java.util.Scanner;

public class HollowPyramid {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the height of the pyramid: ");
        int height = sc.nextInt();
        
        if (height < 1) {
            System.out.println("Height must be at least 1.");
            return;
        }
        System.out.println("\nHollow Pyramid (Height: " + height + "):\n");
        printHollowPyramid(height);
        sc.close();
    }
    public static void printHollowPyramid(int n) {
        printPyramidHelper(n, 1);
    }
    private static void printPyramidHelper(int n, int row) {
        // BASE CASE: Stop when we've printed all rows
        if (row > n) {
            return;
        }
        printSpaces(n - row);
        System.out.print("*");
        if (row == n) {
            // Last row - print all stars at the bottom
            printStars(2 * row - 2);
        } else if (row > 1) {
            // Hollow part - print spaces between stars
            printSpaces(2 * row - 3);
            // Print the right star
            System.out.print("*");
        }
        System.out.println();
        
        // RECURSIVE CALL: Print the next row
        printPyramidHelper(n, row + 1);
    }
    private static void printStars(int count) {
        if (count <= 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }
     private static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }
}