package gof.creational.builder.domain;

public class Engine {
    private final double volume;
    private boolean started;

    public Engine(double volume) {
        this.volume = volume;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            System.out.println("Move on");
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", started=" + started +
                '}';
    }
}
