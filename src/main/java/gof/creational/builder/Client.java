package gof.creational.builder;

import gof.creational.builder.builder.CarBuilder;
import gof.creational.builder.builder.CarManualBuilder;
import gof.creational.builder.director.Director;
import gof.creational.builder.domain.Car;
import gof.creational.builder.domain.CarManual;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        final Car car = carBuilder.getResult();
        System.out.println(car);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        final CarManual carManual = carManualBuilder.getResult();
        System.out.println(carManual.print());
    }
}
