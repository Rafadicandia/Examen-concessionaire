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
}
