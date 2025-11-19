public class Sedan extends Car {
    private double trunkCapacity;

    public Sedan(String brand, String model, String fuel, int fabricationYear, double trunkCapacity) {
        super(brand, model, fuel, fabricationYear);
        if (trunkCapacity <= 0) {
            throw new RuntimeException("Trunk capacity can't be less than 0 or 0");
        }
        this.trunkCapacity = trunkCapacity;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String getCarDescription() {
        return "This car has a trunk with "+trunkCapacity+" L of capacity."
                +" Designed for comfort and safety."
                +"This"+getBrand()+" in it's "
                +getModel()+" offers a special deal for travelers as well as for city users."
                ;
    }
}
