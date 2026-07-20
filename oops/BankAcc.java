package oops;
import java.util.Scanner;
class BankAcc {
    int accNo;
    String accHolderName;
    double balance;
    // Default Constructor
    BankAcc(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }
    void display(){
        System.out.println("Account Details");
        System.out.println("Account No.: "+accNo);
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Balance: "+balance);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No.: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Account Holder Name: ");
        String accHolderName = sc.next();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        BankAcc b1 = new BankAcc(accNo, accHolderName, balance);
        b1.display();
        sc.close();
    }
}