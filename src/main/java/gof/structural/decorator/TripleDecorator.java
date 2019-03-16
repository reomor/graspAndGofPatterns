package gof.structural.decorator;

public class TripleDecorator extends BaseDecorator {
    public TripleDecorator(Component wrappee) {
        super(wrappee);
    }

    @Override
    public double execute(double number) {
        System.out.println("call decorator");
        return super.execute(number);
    }
}
