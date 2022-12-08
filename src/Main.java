import transport.Car;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России");
        lada.setRegNumb("k999op666");
        System.out.println(lada.isCorrectRegNum());
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германии");
        audi.setGearbox("автомат");
        audi.setKey(new Car.Key(true, true));
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германии");
        bmw.setSummerRubber(false);
        bmw.setInsurance(new Car.Insurance(LocalDate.now(), 30_000, "2543681797"));
        bmw.getInsurance().checkExpireDate();
        bmw.getInsurance().checkNumber();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }

}