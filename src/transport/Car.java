package transport;

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

    public Car(String brand, String model, float engineVolume, String colour, int year, String country, String bodyType, int seats, String gears, String regNumber) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        } if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        } if (country == null || country.isEmpty()) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (colour == null || colour.isEmpty()) {
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

    }
}