package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String typeOfBody;
    private final int productionYear;
    private final String productionCountry;
    private int maxSpeed;

    public Transport(String brand, String model, String typeOfBody, int productionYear, String productionCountry, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "седан";
        }
        this.typeOfBody = typeOfBody;
        if (productionYear < 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
        if (maxSpeed < 0) {
            maxSpeed = 300;
        }
        this.maxSpeed = maxSpeed;
    }
    public Transport(String brand, String model, int productionYear, String productionCountry, String typeOfBody) {
        this.brand = brand;
        this.model = model;
        setTypeOfBody("седан");
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getTypeOfBody() {
        return typeOfBody;
    }
    public void setTypeOfBody(String typeOfBody) {
        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "седан";
        }
        this.typeOfBody = typeOfBody;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            maxSpeed = 300;
        }
        this.maxSpeed = maxSpeed;
    }
}