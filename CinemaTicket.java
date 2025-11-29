import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter age group (child/adult/senior): ");
        String ageGroup = sc.nextLine().toLowerCase();

        
        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = sc.nextLine().toLowerCase();

        
        System.out.print("Do you have a valid student ID? (yes/no): ");
        String studentInput = sc.nextLine().toLowerCase();
        boolean isStudent = studentInput.equals("yes");

        
        System.out.print("Is today a festival day? (yes/no): ");
        String festivalInput = sc.nextLine().toLowerCase();
        boolean isFestival = festivalInput.equals("yes");

        
        double price = 0;
        if (ageGroup.equals("child")) {
            price = 150;
        } else if (ageGroup.equals("adult")) {
            price = 250;
        } else if (ageGroup.equals("senior")) {
            price = 200;
        } else {
            System.out.println("Invalid age group entered.");
            return;
        }

        
        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (language.equals("nepali")) {
            
        } else {
            System.out.println("Invalid language entered.");
            return;
        }

        
        if (isStudent) {
            price = price * 0.80; 
        }
        if (isFestival) {
            price = price * 0.85; 
        }

    
        System.out.println("Final ticket price: Rs. " + price);
    }
}