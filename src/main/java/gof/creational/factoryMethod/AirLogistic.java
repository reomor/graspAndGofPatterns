package gof.creational.factoryMethod;

public class AirLogistic extends Logistic {
    @Override
    public Transport getTransport() {
        return new AirTrack();
    }
}
