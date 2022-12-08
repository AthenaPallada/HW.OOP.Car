package transport;
import java.time.LocalDate;
import java.util.Locale;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearbox;
    private final String typeOfBody;
    private String regNumb;
    private final int seasCount;
    private boolean summerRubber;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gearbox,
               String typeOfBody,
               String regNumb,
               int seasCount,
               boolean summerRubber,
               Key key,
               Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        this.productionYear = productionYear;
        if (typeOfBody == null) {
            this.typeOfBody = "седан";
        } else {
            this.typeOfBody = typeOfBody;
        }
        if (gearbox == null) {
            this.gearbox = "МКПП";
        } else {
            this.gearbox = gearbox;
        }
        if (regNumb == null) {
            this.regNumb = "x000xx000";
        } else {
            this.regNumb = regNumb;
        }
        if(key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if(insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.seasCount = seasCount;
        this.summerRubber = summerRubber;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "МКПП",
                "x000xx000",
                "седан",
                5,
                true,
                new Key(),
                new Insurance()
        );
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getTypeOfBody() {
        return typeOfBody;
    }
    public int getSeasCount() {
        return seasCount;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getGearbox() {
        return gearbox;
    }
    public void setGearbox(String gearbox) {
        if (gearbox == null) {
            this.gearbox = "МКПП";
        } else {
            this.gearbox = gearbox;
        }
    }
    public String getRegNumb() {
        return regNumb;
    }
    public void setRegNumb(String regNumb) {
        if (regNumb == null) {
            this.regNumb = "x000xx000";
        } else {
            this.regNumb = regNumb;
        }
    }

    public boolean isSummerRubber() {
        return summerRubber;
    }

    public void setSummerRubber(boolean summerRubber) {
        this.summerRubber = summerRubber;
    }
    public void changeTires() {
        summerRubber = !summerRubber;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    public boolean isCorrectRegNum() {
        if(regNumb.length() != 9) {
            return false;
        }
        char[] chars = regNumb.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isDigit(chars[4]) || !Character.isDigit(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;
        public Insurance(LocalDate expireDate, double cost, String number) {
            if(expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if(number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
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
        public void checkExpireDate() {
            if(expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber() {
            if(number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}