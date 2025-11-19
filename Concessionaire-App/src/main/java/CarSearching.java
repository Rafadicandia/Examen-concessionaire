import java.util.ArrayList;
import java.util.List;

public class CarSearching {
    private ArrayList<Car> listofCars;

    public CarSearching() {
        this.listofCars = new ArrayList<>();
    }

    public void getListOfCelestialBodies() {
        List<String> cars = new ArrayList<>();
        for (Car c : listofCars) {
            System.out.println(c.getCarDescription());
        }
    }

    public void getCarsAfterYear(int year) {

        List<Car> cars = new ArrayList<>();
        for (Car c : listofCars) {
            if (c.getFabricationYear()>year) {
                cars.add(c);
            }
        }
        System.out.println("<<--List Cars builded after "+year+"-->>");
        for (Car c : cars) {
                System.out.println("Brand: "+c.getBrand()+". Model: "+c.getModel()+ "Year: "+c.getFabricationYear());
        }


    }


}
