public class CombinedStarPattern {

    public static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    public static void printIncreasing(int current, int max) {
        if (current > max) {
            return;
        }
        printStars(current);
        System.out.println();
        printIncreasing(current + 1, max);
    }

    public static void printDecreasing(int current, int max) {
        if (current < 1) {
            return;
        }
        printStars(current);
        System.out.println();
        printDecreasing(current - 1, max);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Combined Left-Angled Star Pattern:");
        printIncreasing(1, n);
        printDecreasing(n - 1, n); // n-1 to avoid duplicate middle row
    }
}