package transport.driver;

import transport.Truck;
import transport.category.CategoryC;
import transport.category.CategoryD;

public class DriverC extends Driver<Truck> {
    //private CategoryC categoryC;

    public DriverC(String fullName, boolean hasDrivingLicense, int experience) { //CategoryC categoryC) throws IllegalAccessException {
        super(fullName, hasDrivingLicense, experience);
        //setCategory(categoryC);
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