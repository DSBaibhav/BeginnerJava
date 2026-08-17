package oops;
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
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Current Balance: " + acc.getBalance());
        acc.withdraw(500);
        System.out.println("Current Balance: " + acc.getBalance());
        acc.withdraw(600); // Invalid withdrawal
    }
}