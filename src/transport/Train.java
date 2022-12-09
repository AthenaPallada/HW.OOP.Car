package transport;

public class Train extends Transport {
    private double cost;
    private int time;
    private String nameStation;
    private String terminus;
    private int numCars;
    private String fill;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 int maxSpeed,
                 double cost,
                 String nameStation,
                 String terminus,
                 int numCars,
                 int time) {
        super(brand, model, productionYear, productionCountry,maxSpeed);
        if (cost <= 0) {
            cost = 1000;
        }
        this.cost = cost;
        if (time <= 0) {
            time = 2;
        }
        this.time = time;
        if (nameStation == null || nameStation.isEmpty()) {
            nameStation = "default";
        }
        this.nameStation = nameStation;
        if (terminus == null || terminus.isEmpty()) {
            terminus = "default";
        }
        this.terminus = terminus;
        if (numCars <= 0) {
            numCars = 10;
        }
        this.numCars = numCars;
    }
    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, double cost, String nameStation, String terminus, int numCars) {
        super(brand, model, productionYear, productionCountry, maxSpeed);
        this.cost = cost;
        this.nameStation = nameStation;
        this.terminus = terminus;
        this.numCars = numCars;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            cost = 1000;
        }
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time <= 0) {
            time = 2;
        }
        this.time = time;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        if (nameStation == null || nameStation.isEmpty()) {
            nameStation = "default";
        }
        this.nameStation = nameStation;
    }

    public String getTerminus() {
        return terminus;
    }

    public void setTerminus(String terminus) {
        if (terminus == null || terminus.isEmpty()) {
            terminus = "default";
        }
        this.terminus = terminus;
    }

    public int getNumCars() {
        return numCars;
    }

    public void setNumCars(int numCars) {
        if (numCars <= 0) {
            numCars = 10;
        }
        this.numCars = numCars;
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() +
                ", модель " + getModel() +
                ", год выпуска " + getProductionYear() +
                " в " + getProductionCountry() +
                ", скорость передвижения - " + getMaxSpeed() + " км/ч" +
                ", отходит от " + nameStation +
                ", следует до станции " + terminus +
                ". Цена поездки = " + cost + " рублей" +
                ", в поезде " + numCars + " вагонов";
    }
    @Override
    public void refill(String fill) {
        if(fill.equals("дизель")) {
            System.out.println("Заправить можно только дизелем");
        } else {
            System.out.println("Топливо не подходит для заправки");
        }
    }
}