import java.util.Scanner;
public class AsciiConv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        int asciiVal=ascii(ch);
        System.out.println("The ASCII value of '"+ch+"' is: "+asciiVal);
        sc.close();
    }
    public static int ascii(char c){
        return (int)c;
    }
}