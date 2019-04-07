package gof.creational.builder.domain;

public class Car {
    private double fuel;
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    public Car(double fuel, Type type, int seats, Engine engine, Transmission transmission) {
        this.fuel = fuel;
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
