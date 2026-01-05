package week9;

public class SchoolApp {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Mukul", 20000, "Computer Science", 5000);
        Staff s1 = new Staff(102, "Aarav", 0, 160, 200); 

        t1.displayInfo();
        System.out.println("Annual Salary (Teacher): " + t1.calculateAnnualSalary());
        System.out.println("--------------------------------");

        s1.displayInfo();
        System.out.println("Salary (Staff): " + s1.calculateSalary());
        System.out.println("--------------------------------");

        
        System.out.println("College Name (Static): " + Person.collegeName);
    }
}
