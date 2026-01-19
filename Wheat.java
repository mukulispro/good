package week11;

public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    public double calculateYield() {
        return landArea * 3.2;
    }

    public double calculateWaterRequirement() {
        return landArea * 70000;
    }

    public double calculateTransportCost() {
        return calculateYield() * 1200;
    }

    public String getTransportMethod() {
        return "Small Truck or Tractor";
    }
}
