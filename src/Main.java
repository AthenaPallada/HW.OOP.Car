import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтого",
                2015,
                "России");
        lada.print();
        lada.refill("бензин");
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3,
                "черный",
                2020,
                "Германии");
        audi.print();
        audi.refill("бензин");
        Car bmw = new Car(
                "BMW",
                "Z8",
                3,
                "черный",
                2021,
                "Германии");
        bmw.print();
        bmw.refill("бензин");
        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4, "красный",
                2018,
                "Южной Корее");
        kia.print();
        kia.refill("бензин");
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южной Корее");
        hyundai.print();
        hyundai.refill("бензин");

        System.out.println();
        Train lastochka = new Train(
                "Ласточка",
                "B-901",
                2011,
                "России",
                301,
                3500,
                "Белорусского вокзала",
                "Минск-Пассажирский",
                11);
        System.out.println(lastochka);
        lastochka.refill("дизель");
        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "России",
                270,
                1700,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                8);
        System.out.println(leningrad);
        leningrad.refill("дизель");

        System.out.println();
        Bus olimp = new Bus(
                "ОАО «Транс-Альфа Электро»",
                "ВМЗ-4252 «Олимп»",
                "городской",
                2008,
                "России",
                90);
        System.out.println(olimp);
        olimp.refill("бензин");
        Bus scania = new Bus(
                "Scania",
                "K400 IB 4X2 TOURING HD",
                "туристический",
                2018,
                "Швеции",
                100);
        System.out.println(scania);
        scania.refill("бензин");
        Bus liaz = new Bus(
                "ЯрКамп",
                "ЛиАЗ 5250 \"Вояж\"на шасси SCANIA",
                "междугородний",
                2014,
                "России",
                90);
        System.out.println(liaz);
        liaz.refill("бензин");
    }
}