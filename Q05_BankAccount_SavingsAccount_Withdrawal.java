class BankAccount {
    protected double balance;
    public BankAccount(double balance) { this.balance = balance; }
    public void deposit(double amount) {
        if (amount > 0) { balance += amount; System.out.println("Deposited: " + amount); }
        else System.out.println("Deposit amount must be positive");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; System.out.println("Withdrawn: " + amount); }
        else System.out.println("Withdrawal rejected");
    }
    public double getBalance() { return balance; }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) { super(balance); }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal rejected: balance must remain at least 100");
        }
    }
}
public class Q05_BankAccount_SavingsAccount_Withdrawal {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.withdraw(250);
        account.withdraw(200);
        System.out.println("Final balance: " + account.getBalance());
    }
}
