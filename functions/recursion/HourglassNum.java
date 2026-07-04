import java.util.Scanner;

public class HourglassNum{
    
    public static void printTopHalf(int n, int currentRow) {
        if (currentRow >= n) {
            return;
        }
        
        int spaces = currentRow;
        int numbers = 2 * (n - currentRow) - 1;
        
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        
        if (currentRow == 0) {
            for (int i = 1; i <= numbers; i++) {
                System.out.print(i);
            }
        } else {
            System.out.print(currentRow + 1);
            for (int i = 0; i < numbers - 2; i++) {
                System.out.print(" ");
            }
            System.out.print(n);
        }
        
        System.out.println();
        printTopHalf(n, currentRow + 1);
    }
    
    public static void printBottomHalf(int n, int currentRow) {
        if (currentRow < 0) {
            return;
        }
        
        int spaces = currentRow;
        int numbers = 2 * (n - currentRow) - 1;
        
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        
        if (currentRow == 0) {
            for (int i = 1; i <= numbers; i++) {
                System.out.print(i);
            }
        } else {
            System.out.print(currentRow + 1);
            for (int i = 0; i < numbers - 2; i++) {
                System.out.print(" ");
            }
            System.out.print(n);
        }
        
        System.out.println();
        printBottomHalf(n, currentRow - 1);
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
            
            System.out.println("\nHollow Hourglass Number Pattern:");
            printTopHalf(n, 0);
            printBottomHalf(n, n - 2);
            
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}