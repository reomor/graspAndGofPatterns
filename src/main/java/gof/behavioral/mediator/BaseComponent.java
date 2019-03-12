package gof.behavioral.mediator;

public abstract class BaseComponent implements Component {
    protected Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void execute();
}
