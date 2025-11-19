public class Main {
    public static void main(String[] args) {
        CarSearching concessionaire = new CarSearching();

        concessionaire.addCar(new Sedan("Chevrolet", "Corsa", "Diesel", 2023, 50));
        concessionaire.addCar(new SUV("Renault", "Scenic", "Gas", 2017, "4X2"));
        concessionaire.addCar(new Sportive("Ferrario", "Testarrossa", "Gas", 2024, 340));
SUV suv2 = new SUV("Jeep", "HOla", "Gas", 1978, "4X4");
        concessionaire.getListOfCars();
        concessionaire.getCarsAfterYear(2017);
        concessionaire.getCarsByTypeAndFuel(suv2,"Gas");

    }
}
