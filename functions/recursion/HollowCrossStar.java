import java.util.Scanner;

public class HollowCrossStar{
    
    public static void printHollowCross(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (col == currentRow || col == n - 1 - currentRow) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        printHollowCross(n, currentRow + 1);
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
            
            System.out.println("\nHollow Cross Star Pattern:");
            printHollowCross(n, 0);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}