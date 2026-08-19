package oops;
import java.util.Scanner;
class BankAccount{
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
public class EncapsulationDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your deposit amount: ");
        double depoAmount = sc.nextDouble();
        System.out.print("Enter your withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        System.out.println("Enter another withdrawal amount: ");
        double withdrawAmount1 = sc.nextDouble();
        BankAccount acc = new BankAccount();
        acc.deposit(depoAmount);
        System.out.println("Current Balance: " + acc.getBalance());
        acc.withdraw(withdrawAmount);
        System.out.println("Current Balance: " + acc.getBalance());
        acc.withdraw(withdrawAmount1); // Invalid withdrawal
        System.out.println("Current Balance you can withdraw: " + acc.getBalance());
        sc.close();
    }
}