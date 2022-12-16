package transport.driver;

import transport.PassengerCar;
import transport.category.CategoryD;

public class DriverD extends Driver<PassengerCar> {

    public DriverD(String fullName, boolean hasDrivingLicense, int experience, CategoryD categoryD) {
        super(fullName, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(PassengerCar transport) {
        transport.start();
    }

    @Override
    public void stopMove(PassengerCar transport) {
        transport.end();
    }

    @Override
    public void refillMove(PassengerCar transport) {
        System.out.println("Водитель: " + getFullName() + " заправляет автомобиль " + transport.getBrand());
    }
}