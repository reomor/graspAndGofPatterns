package gof.behavioral.memento;

public class Memento {
    private final OriginatorState state;

    public Memento(OriginatorState state) {
        this.state = state;
    }

    public OriginatorState getState() {
        return state;
    }
}
