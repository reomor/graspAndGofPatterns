package gof.behavioral.mediator;

public class ComponentA extends BaseComponent {
    public void actionAReg() {
        mediator.notify(this, ComponentEvent.CREATE);
    }

    @Override
    public void execute() {
        System.out.println("Executing A");
    }
}
