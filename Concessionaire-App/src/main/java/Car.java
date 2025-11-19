public class Car implements PrintDescription{
    private String brand;
    private String model;
    private String fuel;
    private int fabricationYear;

    public Car(String brand, String model, String fuel, int fabricationYear) {

        if (fabricationYear <= 0) {
            throw new RuntimeException("Year can't be less than 0 or 0");
        }
        if (brand == null || brand.trim().isEmpty()) {
            throw new RuntimeException("Brand can't be null nor empty");
        }

        if (model == null || model.trim().isEmpty()) {
            throw new RuntimeException("Model can't be null nor empty");
        }

        if (fuel == null || fuel.trim().isEmpty()) {
            throw new RuntimeException("Fuel can't be null nor empty");
        }

        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.fabricationYear = fabricationYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }


    @Override
    public String getCarDescription() {
        return "";
    }
}
