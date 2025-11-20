public class WaterLevelMonitor {
    public static void main(String[] args) {
        int waterLevel = 1200; // Sample data

        System.out.println("Current Water Level: " + waterLevel + "L");

        String status = (waterLevel >= 1000) 
            ? "WARNING: Water level has reached 1000L or more!" 
            : "Status: Normal";

        System.out.println(status);
    }
}