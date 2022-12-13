package transport.driver;

import transport.Bus;

public class DriverB extends Driver<Bus> {

    public DriverB(String fullName, boolean hasDrivingLicense, int experience) {
        super(fullName, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.end();
    }

    @Override
    public void refillMove(Bus transport) {
        System.out.println("Водитель: " + getFullName() + " заправляет автобус " + transport.getBrand());
    }
}