public class Swap{
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping using a temporary variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping using temp variable: a = " + a + ", b = " + b);
        // Swapping without using a temporary variable
        a=a+b; //a now holds the sum of a&b
        b=a-b; //b holds the original value of a 
        a=a-b; //a holds the original value of b
        System.out.println("Swapping without temp variable: a = " + a + ", b = " + b);    
    }
}