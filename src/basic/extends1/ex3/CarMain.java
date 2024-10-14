package basic.extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eleccar = new ElectricCar();
        eleccar.move();
        eleccar.charge();
        eleccar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}