package transport;

public class Bus extends Transport {
    public String fill;

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

    @Override
    public void refill(String fill) {
        if(fill.equals("бензин")  || fill.equals("дизель")) {
            System.out.println("Можно заправить бензином или дизелем на заправке");
        } else {
            System.out.println("Информация о топливе не указана");
        }
    }
}