package gof.creational.factoryMethod;

public class AirTrack implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver payload by air");
    }
}
