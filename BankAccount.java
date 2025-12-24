package week7;

public class BankAccount {
    private String owner;
    private double balance;

    
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited: " + amount);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds for " + owner);
        }
    }

    
    public double getBalance() {
        return balance;
    }
}

