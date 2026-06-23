import java.util.Scanner;

public class CustomCharPattern {

    public static void printChar(int count, char symbol) {
        if (count == 0) {
            return;
        }
        System.out.print(symbol);
        printChar(count - 1, symbol);
    }

    public static void printPattern(int currentRow, int totalRows, char symbol) {
        if (currentRow > totalRows) {
            return;
        }
        printChar(currentRow, symbol);
        System.out.println();
        printPattern(currentRow + 1, totalRows, symbol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get character input
        System.out.print("Enter the character to print (e.g., *, #, $): ");
        char symbol = sc.next().charAt(0);
        
        // Get number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.println("\nPattern using '" + symbol + "':");
        printPattern(1, rows, symbol);
        
        sc.close();
    }
}