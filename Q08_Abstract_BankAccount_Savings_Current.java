abstract class BankAccount {
    protected double balance;
    public BankAccount(double openingBalance) { this.balance = openingBalance; }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public double getBalance() { return balance; }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double openingBalance) { super(openingBalance); }
    @Override public void deposit(double amount) {
        if (amount > 0) balance += amount; else System.out.println("Deposit must be positive");
    }
    @Override public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && balance - amount >= 100) balance -= amount;
        else System.out.println("Savings withdrawal rejected (minimum balance 100)");
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(double openingBalance, double overdraftLimit) { super(openingBalance); this.overdraftLimit = overdraftLimit; }
    @Override public void deposit(double amount) {
        if (amount > 0) balance += amount; else System.out.println("Deposit must be positive");
    }
    @Override public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) balance -= amount;
        else System.out.println("Current account overdraft limit exceeded");
    }
}
public class Q08_Abstract_BankAccount_Savings_Current {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(500);
        BankAccount current = new CurrentAccount(500, 300);
        savings.deposit(100); savings.withdraw(200);
        current.withdraw(650);
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Current balance: " + current.getBalance());
    }
}
