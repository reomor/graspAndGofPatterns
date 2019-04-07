package gof.creational.factoryMethod;

public class SeaLogistic extends Logistic {
    @Override
    public Transport getTransport() {
        return new SeaTrack();
    }
}
