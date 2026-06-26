import java.util.Scanner;
public class HollowRectRecur{
    public static void printChar(int count, char symbol) {
        if (count == 0) {
            return; // BASE CASE
        }
        System.out.print(symbol);
        printChar(count - 1, symbol); // RECURSIVE CASE
    }
    public static void printHollowLine(int totalWidth, int currentPos, char symbol) {
        // BASE CASE: If currentPos exceeds totalWidth, stop
        if (currentPos > totalWidth) {
            return;
        }
        
        // Print star at first and last position, space elsewhere
        if (currentPos == 1 || currentPos == totalWidth) {
            System.out.print(symbol);
        } else {
            System.out.print(" ");
        }
        
        // RECURSIVE CASE: Move to next position
        printHollowLine(totalWidth, currentPos + 1, symbol);
    }
    public static void printHollowRectangle(int currentRow, int totalRows, int totalCols, char symbol) {
        // BASE CASE: If currentRow exceeds totalRows, stop
        if (currentRow > totalRows) {
            return;
        }
        
        // For first row, last row, or borders, print full line
        if (currentRow == 1 || currentRow == totalRows) {
            // Print solid line (all stars)
            printChar(totalCols, symbol);
        } else {
            // Print hollow line (stars at ends, spaces in middle)
            printHollowLine(totalCols, 1, symbol);
        }
        
        System.out.println(); // Move to next line
        
        // RECURSIVE CASE: Go to next row
        printHollowRectangle(currentRow + 1, totalRows, totalCols, symbol);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow rectangle: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the hollow rectangle: ");
        int cols = sc.nextInt();
        System.out.print("Enter the symbol to use for the hollow rectangle: ");
        char symbol = sc.next().charAt(0);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("HOLLOW RECTANGLE PATTERN with " + rows + " rows and " + cols + " columns");
        System.out.println("=".repeat(50) + "\n");
        
        printHollowRectangle(1, rows, cols, symbol);
        
        sc.close();
    }
}