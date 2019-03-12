package gof.behavioral.mediator;

public class ComponentB extends BaseComponent {
    public void actionBReg() {
        mediator.notify(this, ComponentEvent.CREATE);
    }

    @Override
    public void execute() {
        System.out.println("Executing A");
    }
}
