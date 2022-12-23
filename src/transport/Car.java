package transport;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    float engineVolume;
    String colour;
    private final int year;
    private final String country;
    private final String bodyType;
    private final int seats;
    private String gears;
    private String regNumber;
    private boolean summerTires;
    private Key key;

    public static class Key {
        private final boolean remoteEngineLaunch;
        private final boolean keylessAccess;
    public Key (boolean remoteEngineLaunch, boolean keylessAccess) {
        this.remoteEngineLaunch = remoteEngineLaunch;
        this.keylessAccess = keylessAccess;
    }
        public Key () {
            this(false, false);
        }

        public boolean isRemoteEngineLaunch() {
            return remoteEngineLaunch;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
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

    public int getSeats() {
        return seats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Car(String brand, String model, float engineVolume, String colour, int year, String country, String bodyType, int seats, String gears, String regNumber) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (colour == null || colour.isEmpty() || colour.isBlank()) {
            this.colour = "White";
        } else {
            this.colour = colour;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Default";
        } else {
            this.bodyType = bodyType;
        }
        if (seats <= 0) {
            this.seats = 2;
        } else {
            this.seats = seats;
        }
        if (gears == null || gears.isEmpty() || gears.isBlank()) {
            this.gears = "Default";
        } else {
            this.gears = gears;
        }
        if (regNumber == null || regNumber.isBlank() || regNumber.isEmpty()) {
            this.regNumber = "XX 0000 XX";
        } else {
            this.regNumber = regNumber;
        }
        this.summerTires = isSummerTires();
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }
}