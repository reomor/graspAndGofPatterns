package gof.creational.factoryMethod;

public class SeaTrack implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver payload by sea");
    }
}
