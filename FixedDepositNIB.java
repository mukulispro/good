import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1; 

        while (choice == 1) {
            
            System.out.print("Enter deposit amount (min Rs.1000): ");
            double P = sc.nextDouble(); 

            if (P < 1000) {
                System.out.println("Deposit must be at least Rs.1000.");
                continue;
            }

            System.out.print("Enter duration in years (max 5): ");
            int years = sc.nextInt();

            if (years > 5 || years <= 0) {
                System.out.println("Duration must be between 1 and 5 years.");
                continue;
            }

            System.out.print("Enter annual interest rate (8–12): ");
            double annualRate = sc.nextDouble(); 

            if (annualRate < 8 || annualRate > 12) {
                System.out.println("Interest rate must be between 8% and 12%.");
                continue;
            }

            
            double r = annualRate / 100.0;

            
            double monthlyRate = r / 12;

            
            int months = years * 12;

            
            
            double A = P * Math.pow(1 + monthlyRate, months);

            
            double feeRate = 0.005;

        
            double fee = A * feeRate;

            
            double finalAmount = A - fee;

            
            System.out.println("\n--- FD Calculation Result ---");
            System.out.printf("Principal (P): Rs. %.2f%n", P);
            System.out.printf("Duration (years): %d%n", years);
            System.out.printf("Annual Rate: %.2f%%%n", annualRate);
            System.out.printf("Monthly Rate: %.5f%n", monthlyRate);
            System.out.printf("Total Months: %d%n", months);
            System.out.printf("Maturity Amount (A): Rs. %.2f%n", A);
            System.out.printf("Processing Fee (0.5%%): Rs. %.2f%n", fee);
            System.out.printf("Final Amount (after fee): Rs. %.2f%n", finalAmount);

            
            System.out.print("\nDo you want to perform another FD calculation? (1=Yes, 0=No): ");
            choice = sc.nextInt();
        }

        System.out.println("Thank you for using Nepal Investment Bank FD Calculator!");
        sc.close();
    }
}