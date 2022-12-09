import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", 3, "черный", 2021, "Германии");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        lada.print();
        audi.print();
        bmw.print();
        kia.print();
        hyundai.print();
    }

}