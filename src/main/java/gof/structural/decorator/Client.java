package gof.structural.decorator;

public class Client {
    public static void main(String[] args) {
        DoubleComponent component = new DoubleComponent();
        component.execute(123);
        TripleDecorator decorator = new TripleDecorator(component);
        decorator.execute(123);
    }
}
