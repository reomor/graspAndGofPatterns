package gof.structural.adapter;

public class FootAdapter implements Adapter {
    private double FOOTS_IN_METER = 3.28084;
    private Service service;

    public FootAdapter(Service service) {
        this.service = service;
    }

    @Override
    public double getLength(int length) {
        return service.getLength(length) * FOOTS_IN_METER;
    }
}
