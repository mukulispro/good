import java.util.Scanner;  // Scanner helps us take input from the user

public class RickshawFare {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Step 2: Ask for distance and time
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        double time = sc.nextDouble();

        // Step 3: Ask if customer is local
        System.out.print("Is the customer local? (yes/no): ");
        String localInput = sc.next();   // read as text
        boolean isLocal = localInput.equalsIgnoreCase("yes"); // true if "yes"

        // Step 4: Ask if travel is at night
        System.out.print("Is it night travel? (yes/no): ");
        String nightInput = sc.next();
        boolean isNight = nightInput.equalsIgnoreCase("yes");

        // Step 5: Calculate base fare
        // Example rates: Rs.20 per km + Rs.2 per minute
        double fare = (distance * 20) + (time * 2);

        // Step 6: Apply local discount (10%) using ternary operator
        fare = isLocal ? fare * 0.9 : fare;

        // Step 7: Apply night surcharge (20%) using ternary operator
        fare = isNight ? fare * 1.2 : fare;

        // Step 8: Show final fare in Nepali format
        System.out.println("Final Fare: Rs. " + Math.round(fare));

        // Close scanner
        sc.close();
    }
}