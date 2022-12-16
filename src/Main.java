import transport.*;
import transport.category.CategoryB;
import transport.category.CategoryC;
import transport.category.CategoryD;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Bus olimp = new Bus("ОАО «Транс-Альфа Электро»", "ВМЗ-4252 «Олимп»", 270, Capacity.MEDIUM);
        Bus scania = new Bus("Scania", "K400 IB 4X2 TOURING HD", 400, Capacity.LARGE);
        Bus liaz = new Bus("ЯрКамп", "ЛиАЗ 5250 \"Вояж\"на шасси SCANIA", 250, Capacity.LARGE);
        Bus maz = new Bus("МАЗ", " - 103", 231, Capacity.SMALL);
        //System.out.println(maz);

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7, TypeOFBody.HATCHBACK);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3, TypeOFBody.SEDAN);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3, TypeOFBody.COUPE);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, TypeOFBody.SEDAN);
//        System.out.println(lada);
//        System.out.println(kia);

        Truck gaz = new Truck("ГАЗ", " - 3307", 120, Weight.N1);
        Truck zil = new Truck("ЗИЛ", " - 431610", 150, Weight.N3);
        Truck uaz = new Truck("UAZ", "2360 Cargo", 128, Weight.N2);
        Truck daf = new Truck("DAF Trucks NV", "CF (Compact Forte)", 340, Weight.N2);
        //System.out.println(daf);

        runDiagnostics(
                olimp, scania, liaz, maz,
                lada, audi, bmw, kia,
                gaz, zil, uaz, daf);

        DriverB peter = new DriverB("Кармаников Питер Иванович", true, 2, new CategoryB());
        DriverC harry = new DriverC("Солдатов Гариэт Петрович",true, 5, new CategoryC());
        DriverD sirius = new DriverD("Соловьев Сириус Поликарпович", true, 7, new CategoryD());

        peter.printInfo(liaz);
        peter.startMove(liaz);
        peter.refillMove(liaz);
        peter.stopMove(liaz);
    }

    private static void runDiagnostics(Transport... transports) {
        for(Transport transport : transports) {
            runDiagnosticsT(transport);
        }
    }

    private static void runDiagnosticsT(Transport transport) {
        try {
            if(!transport.runDiagnostics()) {
                throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}