import java.util.Scanner;

public class HollowDiamondNumberPattern {
    
    public static void printHollowDiamond(int n, int currentRow, boolean isTop) {
        if (isTop) {
            if (currentRow >= n) {
                printHollowDiamond(n, n - 2, false);
                return;
            }
            
            int spaces = n - currentRow - 1;
            int numbers = 2 * currentRow + 1;
            
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            
            if (currentRow == 0) {
                System.out.print("1");
            } else {
                System.out.print("1");
                for (int i = 0; i < numbers - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print(currentRow + 1);
            }
            
            System.out.println();
            printHollowDiamond(n, currentRow + 1, true);
            
        } else {
            if (currentRow < 0) {
                return;
            }
            
            int spaces = n - currentRow - 1;
            int numbers = 2 * currentRow + 1;
            
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            
            if (currentRow == 0) {
                System.out.print("1");
            } else {
                System.out.print("1");
                for (int i = 0; i < numbers - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print(currentRow + 1);
            }
            
            System.out.println();
            printHollowDiamond(n, currentRow - 1, false);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of rows for half diamond: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer!");
                return;
            }
            
            System.out.println("\nHollow Diamond Number Pattern with " + n + " rows:");
            printHollowDiamond(n, 0, true);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}