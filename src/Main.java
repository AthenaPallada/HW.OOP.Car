import transport.Bus;
import transport.PassengerCar;
import transport.Truck;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Bus olimp = new Bus(
                "ОАО «Транс-Альфа Электро»",
                "ВМЗ-4252 «Олимп»",
                270);
        Bus scania = new Bus(
                "Scania",
                "K400 IB 4X2 TOURING HD",
                400);
        Bus liaz = new Bus(
                "ЯрКамп",
                "ЛиАЗ 5250 \"Вояж\"на шасси SCANIA",
                250);
        Bus maz = new Bus(
                "МАЗ",
                " - 103",
                231);

        PassengerCar lada = new PassengerCar(
                "Lada",
                "Granta",
                1.7);
        PassengerCar audi = new PassengerCar(
                "Audi",
                "A8 50 L TDI quattro",
                3);
        PassengerCar bmw = new PassengerCar(
                "BMW",
                "Z8",
                3);
        PassengerCar kia = new PassengerCar(
                "Kia",
                "Sportage 4-го поколения",
                2.4);

        Truck gaz = new Truck(
                "ГАЗ",
                " - 3307",
                120);
        Truck zil = new Truck(
                "ЗИЛ",
                " - 431610",
                150);
        Truck uaz = new Truck(
                "UAZ",
                "2360 Cargo",
                128);
        Truck daf = new Truck(
                "DAF Trucks NV",
                "CF (Compact Forte)",
                340);

        DriverB peter = new DriverB("Кармаников Питер Иванович", true, 2);
        DriverC harry = new DriverC("Солдатов Гариэт Петрович",true, 5);
        DriverD sirius = new DriverD("Соловьев Сириус Поликарпович", true, 7);

        peter.printInfo(liaz);
        peter.startMove(liaz);
        peter.refillMove(liaz);
        peter.stopMove(liaz);
    }
}