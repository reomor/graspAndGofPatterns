package gof.creational.builder.director;

import gof.creational.builder.builder.Builder;
import gof.creational.builder.domain.Engine;
import gof.creational.builder.domain.Transmission;
import gof.creational.builder.domain.Type;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0));
        builder.setTransmission(Transmission.MANUAL);
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(6);
        builder.setEngine(new Engine(2.2));
        builder.setTransmission(Transmission.AUTOMATIC);
    }
}
