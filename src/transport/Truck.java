package transport;

import transport.driver.Competing;

public class Truck extends Transport implements Competing {

    private Weight weight;
    public String fill;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " движение начал");
    }

    @Override
    public void end() {
        System.out.println("Грузовик " + getBrand() + " движение закончил");
    }

    @Override
    public void refill(String fill) {
        if(fill.equals("бензин") || fill.equals("дизель") ) {
            System.out.println("Можно заправить бензином или дизелем");
        } else {
            System.out.println("Информация о топливе не указана");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Вы находитесь на пит-стопе");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int MaximumSpeed() {
        return (int) (Math.random() * 100);
    }

    @Override
    public void printType() {
        if(weight == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom();
            String to = weight.getTo() == null ? "" : "тонн до " + weight.getTo();
            System.out.println("Грузоподъемность: " + from + to + "тонн");
        }
    }

    @Override
    public boolean runDiagnostics() {
        return Math.random() > 0.8;
    }

//    @Override
//    public boolean runDiagnostics(boolean hasDrivingLicense) {
//        return false;
//    }

    @Override
    public String toString() {
        printType();
        return super.toString();
    }
}