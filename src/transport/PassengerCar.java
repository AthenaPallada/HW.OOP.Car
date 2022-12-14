package transport;

import transport.driver.Competing;

public class PassengerCar extends Transport implements Competing {

    private TypeOFBody typeOFBody;
    public String fill;

    public PassengerCar(String brand, String model, double engineVolume, TypeOFBody typeOFBody) {
        super(brand, model, engineVolume);
        setTypeBody(typeOFBody);
    }

    public TypeOFBody getTypeBody() {
        return typeOFBody;
    }

    public void setTypeBody(TypeOFBody typeOFBody) {
       this.typeOFBody = typeOFBody;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " движение начал");
    }

    @Override
    public void end() {
        System.out.println("Автомобиль " + getBrand() + " движение закончил");
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
        return (int) (Math.random() * 100);
    }

    @Override
    public int MaximumSpeed() {
        return (int) (Math.random() * 100);
    }

    @Override
    public void printType() {
        if(typeOFBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова " + typeOFBody.getName());
        }
    }

    @Override
    public String toString() {
        printType();
        return super.toString();
    }
}