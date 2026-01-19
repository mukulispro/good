package week11;

public class Rice extends Crop implements Transportable {

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    public double calculateYield() {
        return landArea * 4.0; 
    }

    public double calculateWaterRequirement() {
        return landArea * 120000; 
    }

    public double calculateTransportCost() {
        return calculateYield() * 1500; 
    }

    public String getTransportMethod() {
        return "Tractor or Mini Truck (Terai/Rural Roads)";
    }
}
