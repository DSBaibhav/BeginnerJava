import java.util.Scanner;
public class Swap2Func {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int n2=sc.nextInt();
        System.out.println("Before swapping: n1 = "+n1+", n2 = "+n2);
        int[] arr={n1,n2};
        swap(arr);
        System.out.println("After swapping: n1 = "+arr[0]+", n2 = "+arr[1]);
        sc.close();
    }
    public static void swap(int arr[]){
        arr[0]=arr[0]+arr[1];
        arr[1]=arr[0]-arr[1];
        arr[0]=arr[0]-arr[1];
    }
}