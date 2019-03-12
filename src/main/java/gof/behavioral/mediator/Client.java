package gof.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        mediator.notify(new ComponentA(), ComponentEvent.CREATE);
        mediator.notify(new ComponentB(), ComponentEvent.CREATE);

        mediator.actA(ComponentEvent.CLICK);
        mediator.actB(ComponentEvent.CLICK);
    }
}
