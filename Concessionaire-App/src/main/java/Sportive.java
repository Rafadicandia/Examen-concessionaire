public class Sportive extends Car implements PrintDescription, Exportable{
    private double maxSpeed;

    public Sportive(String brand, String model, String fuel, int fabricationYear, double maxSpeed) {
        super(brand, model, fuel, fabricationYear);
        if (maxSpeed <= 0) {
            throw new RuntimeException("Maximum speed can't be less than 0 or 0");
        }
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getCarDescription() {
        return "This brilliant machine, is designed for needers for  speed"
                +getBrand()+" "+getModel()
                +" can sepeed up to "+getMaxSpeed()+" km/h,"
                +"providing safety as well as elegance in every corner."
                ;
    }

    @Override
    public String getExportInfo() {
        return getModel()+ "-"+getBrand()+"-"+getFuel()+"-"+getMaxSpeed();
    }
}
