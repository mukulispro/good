package week9;

public class Payroll {
    public static void main(String[] args) {
        
        PermanentEmployee pe = new PermanentEmployee("Mukul", 101, 20000, 5000, 3000, 2000);
        pe.displayInfo();
        System.out.println("Total Salary (Permanent): " + pe.calculateTotalSalary());
        System.out.println("--------------------------------");

        
        ContractEmployee ce = new ContractEmployee("Aarav", 102, 1000, 25);
        ce.displayInfo();
        System.out.println("Total Salary (Contract): " + ce.calculateTotalSalary());
    }
}
