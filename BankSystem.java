package week9;

public class BankSystem {
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount("S001", "Mukul", 5000, 5);
    
        sa.calculateInterest();
        System.out.println("--------------------------------");

        
        CurrentAccount ca = new CurrentAccount("C001", "Aarav", 2000, 1000);
    
        ca.withdraw(2500); 
        ca.withdraw(4000);
    }
}
