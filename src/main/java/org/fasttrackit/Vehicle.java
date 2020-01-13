package org.fasttrackit;

public class Vehicle {

    private String name;
    private String fuelType;
    private double maxSpeed;
    private double mileage;
    private double fuelLevel;
    private double totalTravelDistance;
    private boolean running;

    public double accelerate(double speed, double durationInHours) {

        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        double distance = speed * durationInHours;

        System.out.println("Distance is : " + distance);

        totalTravelDistance = totalTravelDistance + distance;

        double usedFuel = distance * mileage / 100;

        System.out.println(usedFuel);

        fuelLevel = fuelLevel - usedFuel;

        System.out.println("Remaining fuel " + fuelLevel);

        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalTravelDistance() {
        return totalTravelDistance;
    }

    public void setTotalTravelDistance(double totalTravelDistance) {
        this.totalTravelDistance = totalTravelDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                ", totalTravelDistance=" + totalTravelDistance +
                ", running=" + running +
                '}';
    }
}
