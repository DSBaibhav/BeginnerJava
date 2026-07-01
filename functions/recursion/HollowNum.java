import java.util.Scanner;

public class HollowNum{
    
    public static void printHollowNumberPattern(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        int spaces = n - currentRow - 1;
        int numbers = 2 * currentRow + 1;
        
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
            System.out.print(currentRow + 1);
        }
        
        System.out.println();
        
        printHollowNumberPattern(n, currentRow + 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of rows: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer!");
                return;
            }
            
            System.out.println("\nHollow Number Pattern with " + n + " rows:");
            printHollowNumberPattern(n, 0);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}