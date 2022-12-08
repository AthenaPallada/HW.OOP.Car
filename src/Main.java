import transport.Car;
import java.time.LocalDate;
//
//public class Main {
//    public static void main(String[] args) {
//        Car lada = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России");
//        lada.setRegNumb("k999op666");
//        System.out.println(lada.isCorrectRegNum());
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германии");
//        audi.setGearbox("автомат");
//        audi.setKey(new Car.Key(true, true));
//        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германии");
//        bmw.setSummerRubber(false);
//        bmw.setInsurance(new Car.Insurance(LocalDate.now(), 30_000, "2543681797"));
//        bmw.getInsurance().checkExpireDate();
//        bmw.getInsurance().checkNumber();
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее");
//        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
//        printInfo(lada);
//        printInfo(audi);
//        printInfo(bmw);
//        printInfo(kia);
//        printInfo(hyundai);
//
//    }
//
//    private static void printInfo(Car car) {
//        System.out.println(
//                car.getBrand() + " " + car.getModel() +
//                        ",год выпуска " + car.getProductionYear() +
//                        ", сборка в " + car.getProductionCountry() +
//                        ", цвет кузова - " + car.getColor() +
//                        ", объем двигателя — " + car.getEngineVolume() +
//                        ", коробка передач - " + car.getGearbox() +
//                        ",тип кузова - " + car.getTypeOfBody() +
//                        ", регистрационный номер - " + car.getRegNumb() +
//                        ", количество мест - " + car.getSeasCount() +
//                        ", " + (car.isSummerRubber() ? "летняя" : "зимняя") + " резина" +
//                        ", " + (car.getKey().isKeylessAccess() ? "бесключевой доступ" : "ключевой доступ") +
//                        ", " + (car.getKey().isRemoteEngineStart() ? "удаленный запуск двигателя" : "обычный запуск двигателя") +
//                        ", номер страховки - " + car.getInsurance().getNumber() +
//                        ", стоимость страховки - " + car.getInsurance().getCost() +
//                        ", срок действия страховки - " + car.getInsurance().getExpireDate()
//        );
//    }
//}
