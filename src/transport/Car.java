package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private String gear;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerOrWinter;

    public String toString() {
        return brand + model + engineVolume + color + year + country;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        this.gear = "default";
        this.registrationNumber = "default";
        this.bodyType = "default";
        this.numberOfSeats = 4;
        this.summerOrWinter = true;
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

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null) {
            this.gear = "default";
        } else {
            this.gear = gear;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber== null) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerOrWinter() {
        return summerOrWinter;
    }

    public void setSummerOrWinter(boolean summerOrWinter) {
        this.summerOrWinter = summerOrWinter;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void changeTypeTire() {
        summerOrWinter = ! summerOrWinter;
    }

    public static class Key {
        public Key(boolean changeEngine, boolean wirelessKey) {
            this.changeEngine = changeEngine;
            this.wirelessKey = wirelessKey;
        }
        private final boolean changeEngine;
        private final boolean wirelessKey;

    }
}

