package transport.driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, boolean hasDrivingLicense, int experience) {
        super(fullName, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.end();
    }

    @Override
    public void refillMove(Truck transport) {
        System.out.println("Водитель: " + getFullName() + " заправляет грузовик " + transport.getBrand());
    }
}