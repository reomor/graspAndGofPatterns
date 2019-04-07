package gof.creational.builder.builder;

import gof.creational.builder.domain.Engine;
import gof.creational.builder.domain.Transmission;
import gof.creational.builder.domain.Type;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}
