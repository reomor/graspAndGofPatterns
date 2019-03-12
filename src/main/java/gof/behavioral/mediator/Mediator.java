package gof.behavioral.mediator;

public interface Mediator {
    void notify(Component sender, ComponentEvent event);
    void actA(ComponentEvent event);
    void actB(ComponentEvent event);
}
