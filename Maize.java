package week11;

public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Summer / Hill", landArea);
    }

    public double calculateYield() {
        return landArea * 2.5;
    }

    public double calculateWaterRequirement() {
        return landArea * 40000;
    }

    public double calculateTransportCost() {
        return calculateYield() * 1800;
    }

    public String getTransportMethod() {
        return "Mules or Small Pickup (Hilly Areas)";
    }
}
