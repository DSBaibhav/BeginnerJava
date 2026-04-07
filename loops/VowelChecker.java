import java.util.Scanner;
public class VowelChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch+" is a vowel.");
            }
            else{
                System.out.println(ch+" is not a vowel.");
            }
        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch+" is not an alphabet rather it is a digit.");
        }
        else{
            System.out.println(ch+" is not an alphabet rather it is a special character.");
        }
        sc.close();
    }
}