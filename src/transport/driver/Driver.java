package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private String fullName;
    private boolean hasDrivingLicense;
    private int experience;

    public Driver(String fullName, boolean hasDrivingLicense, int experience) {
        setFullName(fullName);
        this.hasDrivingLicense = hasDrivingLicense;
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

    public void setExperience(int experience) {
        if(experience > 0)
            this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refillMove(T transport);

    public void printInfo(T transport) {
        System.out.println("Водитель: " + fullName + " управляет автомобилем - " + transport.getBrand() + " и будет участвовать в заезде");
    }
}