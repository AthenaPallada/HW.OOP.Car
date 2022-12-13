package transport;

import transport.driver.Competing;

public class Bus extends Transport implements Competing {
    public String fill;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
}