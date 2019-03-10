package gof.behavioral.state;

public class ThisState implements State {
    private StateContext stateContext;

    public ThisState(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    @Override
    public void doSmth() {
        System.out.println("This state");
        stateContext.changeState(new ThatState(stateContext));
    }
}
