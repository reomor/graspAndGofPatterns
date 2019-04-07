package gof.creational.builder.domain;

public class CarManual {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    public CarManual(Type type, int seats, Engine engine, Transmission transmission) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String print() {
        String info = "Car user manual:\n";
        info += String.format("Type is: %s\n", type);
        info += String.format("Number of seats is: %d\n", seats);
        info += String.format("Engine is: %s\n", engine);
        info += String.format("Transmission is: %s\n", transmission);
        return info;
    }
}
