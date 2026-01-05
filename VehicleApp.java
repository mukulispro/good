package week9;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 50000, 5000, 4, "Electric");
        Bike bike = new Bike("Yamaha", 1500, 200, 150);

        System.out.println("=== Car Info ===");
        car.displayInfo();

        System.out.println("\n=== Bike Info ===");
        bike.displayInfo();
    }
}
 
    
