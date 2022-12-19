import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) { //throws IllegalAccessException {
        Mechanic<PassengerCar> nik = new Mechanic<PassengerCar>("Ник", "Никитов", "\"Быстро и дешево\"");
        Mechanic<Truck> kik = new Mechanic<Truck>("Кик", "Кукушкин", "\"На 7 небе\"");
        Mechanic<Bus> mike = new Mechanic<Bus>("Майк", "Шутов", "\"Быстро и дешево\"");
        Sponsor gazprom = new Sponsor("Газпром", 5_000_000);
        Sponsor bipi = new Sponsor("BIPI", 3_500_000);

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7, TypeOFBody.HATCHBACK);
        lada.addDriver(new DriverD("Соловьев Сириус Поликарпович", true, 7)); //new CategoryD()));
        lada.addMechanic(nik);
        lada.addSponsor(gazprom);
//        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3, TypeOFBody.SEDAN);
//        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3, TypeOFBody.COUPE);
//        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, TypeOFBody.SEDAN);
//        System.out.println(lada);
//        System.out.println(kia);

        Bus olimp = new Bus("ОАО «Транс-Альфа Электро»", "ВМЗ-4252 «Олимп»", 270, Capacity.MEDIUM);
        olimp.addDriver(new DriverB("Кармаников Питер Иванович", true, 2)); //new CategoryB()));
        olimp.addMechanic(kik);
        olimp.addSponsor(bipi);
//        Bus scania = new Bus("Scania", "K400 IB 4X2 TOURING HD", 400, Capacity.LARGE);
//        Bus liaz = new Bus("ЯрКамп", "ЛиАЗ 5250 \"Вояж\"на шасси SCANIA", 250, Capacity.LARGE);
//        Bus maz = new Bus("МАЗ", " - 103", 231, Capacity.SMALL);
        //System.out.println(maz);

        Truck gaz = new Truck("ГАЗ", " - 3307", 120, Weight.N1);
        gaz.addDriver(new DriverC("Солдатов Гариэт Петрович",true, 5)); //new CategoryC()));
        gaz.addMechanic(mike);
        gaz.addSponsor(gazprom);
//        Truck zil = new Truck("ЗИЛ", " - 431610", 150, Weight.N3);
//        Truck uaz = new Truck("UAZ", "2360 Cargo", 128, Weight.N2);
//        Truck daf = new Truck("DAF Trucks NV", "CF (Compact Forte)", 340, Weight.N2);
        //System.out.println(daf);

//        runDiagnostics(
//                olimp, scania, liaz, maz,
//                lada, audi, bmw, kia,
//                gaz, zil, uaz, daf);

       // DriverB peter = new DriverB("Кармаников Питер Иванович", true, 2, new CategoryB());
//        DriverC harry = new DriverC("Солдатов Гариэт Петрович",true, 5, new CategoryC());
//        DriverD sirius = new DriverD("Соловьев Сириус Поликарпович", true, 7, new CategoryD());

        List<Transport> transports = List.of(lada, olimp, gaz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(gaz);
        serviceStation.service();
        serviceStation.service();


        for (Transport transport : transports) {
            printInfoT(transport);
        }


//        peter.printInfo(liaz);
//        peter.startMove(liaz);
//        peter.refillMove(liaz);
//        peter.stopMove(liaz);
    }

    private static void printInfoT(Transport transport) {
        System.out.println("Информация по транспорту: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
    }

    private static void service(Transport... transports) {
        for(Transport transport : transports) {
            serviceT(transport);
        }
    }

    private static void serviceT(Transport transport) {
        try {
            if(!transport.service()) {
                throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}