import java.util.Scanner;
public class DiamondRecur{
    public static void printChar(int count, char symbol) {
        if (count == 0) {
            return; // BASE CASE: Stop recursion
        }
        System.out.print(symbol);
        printChar(count - 1, symbol); // RECURSIVE CASE
    }
    public static void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }
    public static void printUpperHalf(int currentRow,int totalRows,char symbol){
        if (currentRow > totalRows) {
            return; // BASE CASE: Stop recursion
        }
        printSpaces(totalRows - currentRow);
        printChar((2 * currentRow) - 1, symbol);
        System.out.println();
        printUpperHalf(currentRow + 1, totalRows, symbol); // RECURSIVE CASE
    }
    public static void printLowerHalf(int currentRow,int totalRows,char symbol){
         if (currentRow == 0) {
            return;
        }
        printSpaces(totalRows - currentRow);
        printChar((2 * currentRow) - 1, symbol);
        System.out.println();
         printLowerHalf(currentRow - 1, totalRows, symbol);
    }
    public static void printDiamond(int rows, char symbol) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("DIAMOND PATTERN with " + rows + " rows");
        System.out.println("=".repeat(50) + "\n");
        
        // Print upper half (increasing)
        printUpperHalf(1, rows, symbol);
        
        // Print lower half (decreasing) - start from rows-1 to avoid duplicate middle
        printLowerHalf(rows - 1, rows, symbol);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond: ");
        int rows = sc.nextInt();
        System.out.print("Enter the symbol to use for the diamond: ");
        char symbol = sc.next().charAt(0);
        
        printDiamond(rows, symbol);
        
        sc.close();
    }

}