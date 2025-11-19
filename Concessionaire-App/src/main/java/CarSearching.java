import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarSearching {
    private ArrayList<Car> listofCars;

    public CarSearching() {
        this.listofCars = new ArrayList<>();
    }
    public void addCar(Car car){
        listofCars.add(car);
    }
    public List<Car> getListOfCars() {

        return listofCars;
    }

    public void getCarsAfterYear(int year) {

        List<Car> cars = listofCars.stream().filter(c -> c.getFabricationYear()>year).toList();

        //List<Car> cars = new ArrayList<>();
//        for (Car c : listofCars) {
//            if (c.getFabricationYear() > year) {
//                cars.add(c);
//            }
//        }
//        System.out.println("<<--List Cars builded after " + year + "-->>");
//        for (Car c : cars) {
//            System.out.println("Brand: " + c.getBrand() + ". Model: " + c.getModel() + "Year: " + c.getFabricationYear());
//        }

    }

    public void getCarsByTypeAndFuel(Car car, String fuel) {
        List<Car> cars = new ArrayList<>();
        for (Car c : listofCars) {
            if (c instanceof Car && c.getFuel().equals(fuel)) {
                cars.add(c);
            }
        }
        System.out.println("<<--List Cars of type " + car.toString() + " and fuel: "+fuel+"-->>");
        for (Car c : cars) {
            System.out.println("Brand: " + c.getBrand() + ". Model: " + c.getModel() + "Fuel: " + c.getFuel());
        }

    }


}
