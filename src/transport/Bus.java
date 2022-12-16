package transport;

import transport.driver.Competing;

public class Bus extends Transport implements Competing {

    private Capacity capacity;
    public String fill;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " движение начал");
    }

    @Override
    public void end() {
        System.out.println("Автобус " + getBrand() + " движение закончил");
    }

    @Override
    public void refill(String fill) {
        if(fill.equals("бензин")  || fill.equals("дизель")) {
            System.out.println("Можно заправить бензином или дизелем на заправке");
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
        if(capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость: " + capacity.getFrom() + " - " + capacity.getTo() + " мест");
        }
    }

    @Override
    public boolean runDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + "в диагностике не требуется");
        return true;
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