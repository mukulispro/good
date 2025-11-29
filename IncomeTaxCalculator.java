import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your annual income in NPR: ");
        double income = sc.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Your total tax payable is: NPR " + tax);
    }

    
    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 500000) {
            
            tax = income * 0.01;
        } else if (income <= 700000) {
            
            
            tax = (500000 * 0.01) + ((income - 500000) * 0.10);
        } else {
            
            tax = (500000 * 0.01) + (200000 * 0.10) + ((income - 700000) * 0.20);
        }

        return tax;
    }
     
    

} 