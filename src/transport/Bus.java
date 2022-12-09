package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String typeOfBody, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, typeOfBody, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() +
                ", модель " + getModel() +
                ", год выпуска " + getProductionYear() +
                " в " + getProductionCountry() +
                ", скорость передвижения - " + getMaxSpeed() + " км/ч";
    }
}