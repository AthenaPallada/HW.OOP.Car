package transport;

import transport.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(Double.compare(engineVolume, 0D) == 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }
//    public Transport(String brand, String model, String typeOfBody, int productionYear, String productionCountry, int maxSpeed) {
//        if (brand == null || brand.isEmpty()) {
//            brand = "default";
//        }
//        this.brand = brand;
//        if (model == null || model.isEmpty()) {
//            model = "default";
//        }
//        this.model = model;
//        if (typeOfBody == null || typeOfBody.isEmpty()) {
//            typeOfBody = "седан";
//        }
//        this.typeOfBody = typeOfBody;
//        if (productionYear < 0) {
//            productionYear = 2000;
//        }
//        this.productionYear = productionYear;
//        if (productionCountry == null || productionCountry.isEmpty()) {
//            productionCountry = "default";
//        }
//        this.productionCountry = productionCountry;
//        if (maxSpeed < 0) {
//            maxSpeed = 300;
//        }
//        this.maxSpeed = maxSpeed;
//    }
//    public Transport(String brand, String model, int productionYear, String productionCountry, String typeOfBody) {
//        this.brand = brand;
//        this.model = model;
//        setTypeOfBody("седан");
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//    }
//    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
//        this.brand = brand;
//        this.model = model;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//        this.maxSpeed = maxSpeed;
//    }
//    public String getBrand() {
//        return brand;
//    }
//    public String getModel() {
//        return model;
//    }
//    public String getTypeOfBody() {
//        return typeOfBody;
//    }
//    public void setTypeOfBody(String typeOfBody) {
//        if (typeOfBody == null || typeOfBody.isEmpty()) {
//            typeOfBody = "седан";
//        }
//        this.typeOfBody = typeOfBody;
//    }
//    public int getProductionYear() {
//        return productionYear;
//    }
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed < 0) {
//            maxSpeed = 300;
//        }
//        this.maxSpeed = maxSpeed;
//    }


    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?> drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void start();

    public abstract void end();

    public abstract void refill(String fill);

    public abstract void printType();

    public abstract boolean service();
    public abstract void repair();

    @Override
    public String toString() {
        return "Брэнд = " + brand +
                ", модель " + model +
                ", объем двигателя " + engineVolume;
    }
}