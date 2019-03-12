package gof.behavioral.mediator;

public class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;

    @Override
    public void notify(Component sender, ComponentEvent event) {
        sender.setMediator(this);
        switch (event) {
            case CREATE:
                if (sender instanceof ComponentA) {
                    this.componentA = (ComponentA) sender;
                } else if (sender instanceof ComponentB) {
                    this.componentB = (ComponentB) sender;
                }
                break;
            case CLICK:
                if (sender instanceof ComponentA) {
                    actA(event);
                } else if (sender instanceof ComponentB) {
                    actB(event);
                }
                break;
            default:
        }
    }

    @Override
    public void actA(ComponentEvent event) {
        System.out.println(event + " A");
        componentA.execute();
    }

    @Override
    public void actB(ComponentEvent event) {
        System.out.println(event + " B");
        componentB.execute();
    }
}
