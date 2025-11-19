public class SUV extends Car implements PrintDescription {
    private String traction;

    public SUV(String brand, String model, String fuel, int fabricationYear, String traction) {
        super(brand, model, fuel, fabricationYear);
        if (traction == null || traction.trim().isEmpty()) {
            throw new RuntimeException("Traction can't be null nor empty");
        }
        this.traction = traction;
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }

    @Override
    public String getCarDescription() {
        return "This "+getBrand()+" "+getModel()
                +" offers a "+getTraction()+" for traction."
                +" This SUV comes as a versitile car ready for action in the city jungle as well as for the mighty roads."
                ;
    }
}
