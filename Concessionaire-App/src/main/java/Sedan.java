public class Sedan extends Car{
    private double trunkCapacity;

    public Sedan(String brand, String model, String fuel, int fabricationYear, double trunkCapacity) {
        super(brand, model, fuel, fabricationYear);
        if (trunkCapacity <= 0) {
            throw new RuntimeException("Trunk capacity can't be less than 0 or 0");
        }
        this.trunkCapacity = trunkCapacity;
    }
}
