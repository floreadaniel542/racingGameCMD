package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setManufacturer("BMW");
        engine.setCapacity(300);
        engine.setHorsePower(299);

        Car car1 = new Car(engine);
        car1.setName("BMW");
        car1.setFuelType("Gasoline");
        car1.setDoorCount(5);
        car1.setMaxSpeed(280);
        car1.setMileage(8.4);
        car1.setFuelLevel(70);

        car1.accelerate(70, 1);

        System.out.println("Name care is: " + car1.getName());
        System.out.println(car1.getTotalTravelDistance());
        System.out.println(car1.isRunning());

        Engine engine1 = new Engine();
        engine1.setManufacturer("Audi");
        engine1.setCapacity(4600);
        engine1.setHorsePower(625);

        Car car2 = new Car(engine1);
        car2.setName("Audi");
        car2.setFuelType("Gasoline");
        car2.setDoorCount(3);
        car2.setMaxSpeed(320);
        car2.setMileage(12.4);
        car2.setFuelLevel(70);

        car2.accelerate(120, 2);

        System.out.println("Name care is: " + car2.getName());
        System.out.println(car2.getTotalTravelDistance());
        System.out.println(car2.isRunning());


    }
}
