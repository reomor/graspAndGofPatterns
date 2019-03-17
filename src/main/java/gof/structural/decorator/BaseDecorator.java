package gof.structural.decorator;

public abstract class BaseDecorator implements Component {
    private Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double execute(double number) {
        System.out.println("call wrapped component");
        return wrappee.execute(number);
    }
}
