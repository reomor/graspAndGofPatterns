package gof.creational.builder.builder;

import gof.creational.builder.domain.CarManual;
import gof.creational.builder.domain.Engine;
import gof.creational.builder.domain.Transmission;
import gof.creational.builder.domain.Type;

public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public CarManual getResult() {
        return new CarManual(type, seats, engine, transmission);
    }
}
