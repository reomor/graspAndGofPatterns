package gof.behavioral.memento;

public class Originator {
    private OriginatorState state;

    public Originator() {
        this.state = OriginatorState.OFF;
    }

    public Originator(OriginatorState state) {
        this.state = state;
    }

    public void setState(OriginatorState state) {
        this.state = state;
    }

    public OriginatorState getState() {
        return state;
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }
}
