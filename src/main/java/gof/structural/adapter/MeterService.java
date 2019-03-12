package gof.structural.adapter;

public class MeterService implements Service {
    @Override
    public double getLength(double length) {
        return length;
    }
}
