package gof.creational.factoryMethod;

public abstract class Logistic {
    public void deliverContainer() {
        final Transport transport = getTransport();
        transport.deliver();
    }

    public abstract Transport getTransport();
}
