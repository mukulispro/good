package week11;

public class FarmManagementSystem {

    public static void main(String[] args) {

        Crop[] crops = new Crop[3];
        crops[0] = new Rice(1.2);  
        crops[1] = new Wheat(0.8);  
        crops[2] = new Maize(0.5);  

        for (Crop crop : crops) {

            crop.displayCropInfo();
            System.out.println("Expected Yield: " + crop.calculateYield() + " tons");
            System.out.println("Water Requirement: " + crop.calculateWaterRequirement() + " liters");

            Transportable t = (Transportable) crop;
            System.out.println("Transport Method: " + t.getTransportMethod());
            System.out.println("Transport Cost: NPR " + t.calculateTransportCost());

            System.out.println("----------------------------------");
        }
    }
}
