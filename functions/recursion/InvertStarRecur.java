public class InvertStarRecur{

    public static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    public static void printPattern(int currentRow, int totalRows) {
        // Base case: if currentRow is less than 1, stop
        if (currentRow < 1) {
            return;
        }
        
        // Print stars for current row
        printStars(currentRow);
        System.out.println();
        
        // Recursive call with decremented row count
        printPattern(currentRow - 1, totalRows);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Inverted Left-Angled Star Pattern:");
        printPattern(n, n);
    }
}