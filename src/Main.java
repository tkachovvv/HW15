import com.sun.jdi.connect.Transport;
import transport.Car;

public class Main {
    public static void main (String[] args) {
        Car car1 = new Car("Lada", " Granta ", 1.7f, " Yellow ", 2015, " Assembled in Russia", "Купе", 2, "Механика", " ");
        Car car2 = new Car("Audi", " A8 L TDI quattro ", 3.0f, " Black ", 2020, " Assembled in Germany", "Кабриолет", 4, "Автомат", " ");
        Car car3 = new Car("BMW", " Z8 ", 3.0f, " Black ", 2021, " Assembled in Germany", "SUV", 5, "Механика", " ");
        Car car4 = new Car("Kia", " Sportage 4-th Gen ", 2.4f, " Red ", 2018, " Assembled in South Korea", "Седан", 4, "Автомат", " ");
        Car car5 = new Car("Hyundai", " Avente ", 0, " Orange ", 0, " Assembled in South Korea", "Седан", 4,"Автомат", " ");
        car1.setSummerTires(false);
        car2.setSummerTires(true);
        car3.setSummerTires(true);
        car4.setSummerTires(false);
        car5.setSummerTires(true);
        car1.setRegNumber("AB 6083 KH");
        car1.setKey(new Car.Key(false, false));
        car2.setKey(new Car.Key(true , false));
        car3.setKey(new Car.Key(true, true));
        car4.setKey(new Car.Key(false, true));
        car5.setKey(new Car.Key(true, false));
        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        printInfo(car5);

    }
    private static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                ", год выпуска: " + car.getYear() +
                ", страна сборки: " + car.getCountry() +
                ", цвет кузова: " + car.getColour() +
                ", объем двигателя: " + car.getEngineVolume() +
                ", коробка передач: " + car.getGears() +
                ", тип кузова: " + car.getBodyType() +
                ", регистрационный номер: " + car.getRegNumber() +
                ", количество мест: " + car.getSeats() +
                ", " + (car.isSummerTires() ? "летняя" :  "зимняя") + " резина" +
                        ", " + (car.getKey().isKeylessAccess()? "с бесключевым" : "с ключевым") + " доступом" +
                        " и " + (car.getKey().isRemoteEngineLaunch()? "c функцией дистанционного запуска двигателя" : "без функции дистанционного запуска двигателя")
        );
    }
}