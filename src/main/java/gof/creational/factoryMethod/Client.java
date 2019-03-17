package gof.creational.factoryMethod;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Logistic logistic;
        if(new Random().nextInt(10) % 2 == 0) {
            logistic = new SeaLogistic();
        } else {
            logistic = new AirLogistic();
        }
        logistic.deliverContainer();
    }
}
