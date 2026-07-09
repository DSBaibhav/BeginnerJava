import java.util.Scanner;

public class HollowSwastik{
    
    public static void printSwastik(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (currentRow < n / 2) {
                if (col == 0 || col == n / 2 || (col == n - 1 && currentRow == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } else if (currentRow == n / 2) {
                System.out.print("*");
            } else {
                if (col == n - 1 || col == n / 2 || (col == 0 && currentRow == n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        
        System.out.println();
        printSwastik(n, currentRow + 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an odd number for size: ");
            int n = scanner.nextInt();
            
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Please enter a positive odd integer!");
                return;
            }
            
            System.out.println("\nHollow Swastik Star Pattern:");
            printSwastik(n, 0);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}