package transport;
import java.time.LocalDate;

public class Car extends Transport {
    private String fill;
    private double engineVolume;
    private String color;
    private String gearbox;
    private final String regNumb;
    private int seasCount;
    private boolean summerRubber;
    private Key key;
    private Insurance insurance;
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String typeOfBody,
               String regNumb) {
        super(brand, model, productionYear, productionCountry, typeOfBody);
        setEngineVolume(engineVolume);
        setGearbox(null);
        this.color = color;
        if (regNumb == null || regNumb.isEmpty()) {
            regNumb = "x000xx000";
        }
        this.regNumb = regNumb;
        setSeasCount(0);
        setKey(null);
        setInsurance(null);
        setSummerRubber(true);
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                null,
                null
        );
    }

    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        if(key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public void setInsurance(Insurance insurance) {
        if(insurance == null) {
            insurance = new Insurance(null, 10_000, null);
        }
        this.insurance = insurance;
    }
    public String getRegNumb() {
        return regNumb;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if(Double.compare(engineVolume, 0D) == 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null) {
            color = "белый";
        }
        this.color = color;
    }
    public int getSeasCount() {
        return seasCount;
    }
    public void setSeasCount(int seasCount) {
        if(seasCount <= 0) {
            seasCount = 5;
        }
        this.seasCount = seasCount;
    }
    public String getGearbox() {
        return gearbox;
    }
    public void setGearbox(String gearbox) {
        if (gearbox == null || gearbox.isEmpty()) {
            gearbox = "МКПП";
        }
        this.gearbox = gearbox;
    }
    public boolean isSummerRubber() {
        return summerRubber;
    }
    public void setSummerRubber(boolean summerRubber) {
        this.summerRubber = summerRubber;
    }
    public void changeTires() {
        setSummerRubber(!summerRubber);
    }
    public boolean isCorrectRegNum() {
        return regNumb.length() == 9
                && Character.isLetter(regNumb.charAt(0))
                && Character.isLetter(regNumb.charAt(4))
                && Character.isLetter(regNumb.charAt(5))
                && Character.isDigit(regNumb.charAt(1))
                && Character.isDigit(regNumb.charAt(2))
                && Character.isDigit(regNumb.charAt(3))
                && Character.isDigit(regNumb.charAt(6))
                && Character.isDigit(regNumb.charAt(7))
                && Character.isDigit(regNumb.charAt(8));
    }
    @Override
    public String toString() {
        return "Врэнд = " + getBrand() +
                ", модель = " + getModel() +
                ", тип кузова = " + getTypeOfBody() +
                ", год выпуска = " + getProductionYear() +
                ", сборка в = " + getProductionCountry() +
                ", engineVolume = " + engineVolume +
                ", \nцвет кузова = " + color +
                ", коробка передач = " + gearbox +
                ", регистрационный номер = " + regNumb +
                ", количество мест = " + seasCount +
                ", " + (isSummerRubber() ? "летняя" : "зимняя") + " резина" +
                ", " + (getKey().isKeylessAccess() ? "бесключевой доступ" : "ключевой доступ") +
                ", " + (getKey().isRemoteEngineStart() ? "удаленный запуск двигателя" : "обычный запуск двигателя") +
                ", \nInsurance: " + insurance;
    }
    public void print() {
        System.out.println(this);
    }
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
        @Override
        public String toString() {
            return "удалённый запуск двигателя = " + remoteEngineStart +
                    ", бесключевой доступ = " + keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (cost <= 0) {
                cost = 10_000;
            }
            this.cost = cost;
            if (number == null || number.isEmpty()) {
                number = "123456789";
            }
            this.number = number;
        }
        public void checkExpireDate() {
            boolean expired = expireDate.isAfter(LocalDate.now());
            if (expired) {
                System.out.println("Срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber() {
            boolean correct = number.length() == 9;
            if (!correct) {
                System.out.println("Номер страховки некорректный!");
            }
        }
        public LocalDate getExpireDate() {
            return expireDate;
        }
        public double getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Срок действия страховки до = " + expireDate +
                    ", стоимость страховки = " + cost +
                    ", номер страховки = " + number;
        }
    }
    @Override
    public void refill(String fill) {
        if(fill.equals("бензин") || fill.equals("дизель") ) {
            System.out.println("Можно заправить бензином или дизелем");
        } else if(fill.equals("ток")) {
            System.out.println("Зарядить на специальных электроду-парковках");
        } else {
            System.out.println("Информация о топливе не указана");
        }
    }
}