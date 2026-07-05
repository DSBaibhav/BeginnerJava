import java.util.Scanner;

public class HollowSquareNum{
    
    public static void printHollowSquare(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        if (currentRow == 0 || currentRow == n - 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
            }
        } else {
            System.out.print("1");
            for (int i = 0; i < n - 2; i++) {
                System.out.print(" ");
            }
            System.out.print(n);
        }
        
        System.out.println();
        printHollowSquare(n, currentRow + 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the size of square: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer!");
                return;
            }
            
            System.out.println("\nHollow Square Number Pattern:");
            printHollowSquare(n, 0);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}