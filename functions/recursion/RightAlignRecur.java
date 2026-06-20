public class RightAlignRecur {

    public static void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    public static void printPattern(int currentRow, int totalRows) {
        if (currentRow > totalRows) {
            return;
        }
        
        // Print spaces first
        printSpaces(totalRows - currentRow);
        // Then print stars
        printStars(currentRow);
        System.out.println();
        
        printPattern(currentRow + 1, totalRows);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Right-Aligned (Left-Angled with Spaces):");
        printPattern(1, n);
    }
}