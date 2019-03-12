package gof.behavioral.state;

public class ThatState implements State {
    private StateContext stateContext;

    public ThatState(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    @Override
    public void doSmth() {
        System.out.println("That state");
        stateContext.changeState(new StartState(stateContext));
    }
}
