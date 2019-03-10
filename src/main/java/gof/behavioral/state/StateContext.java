package gof.behavioral.state;

public class StateContext {
    private State state;

    public StateContext() {
        this.state = new StartState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void doThis() {
        state.doSmth();
    }
}
