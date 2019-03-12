package gof.behavioral.mediator;

public interface Component {
    void setMediator(Mediator mediator);
    void execute();
}
