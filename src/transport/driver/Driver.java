package transport.driver;

import transport.Transport;
import transport.category.Category;

public abstract class Driver<T extends Transport> {
    private String fullName;
    private boolean hasDrivingLicense;
    private int experience;
    private Category category;

    public Driver(String fullName, boolean hasDrivingLicense, int experience, Category category) throws IllegalAccessException {
        setFullName(fullName);
        setHasDrivingLicense(hasDrivingLicense);
        setExperience(experience);
        setCategory(category);
    }

    public Driver(String fullName, boolean hasDrivingLicense, int experience) {
        setFullName(fullName);
        setHasDrivingLicense(hasDrivingLicense);
        setExperience(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if(StringUtils.isNullOrEmpty(fullName))
            this.fullName = fullName;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) throws IllegalAccessException {
        if(category == null) {
            throw new IllegalAccessException("Необходимо указать тип прав!");
        }
        this.category = category;
    }

    public void setExperience(int experience) {
        if(experience > 0)
            this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refillMove(T transport);

    public void printInfo(T transport) {
        System.out.println("Водитель: " + getFullName() + " управляет автомобилем - " + transport.getBrand() + " и будет участвовать в заезде");
    }
}