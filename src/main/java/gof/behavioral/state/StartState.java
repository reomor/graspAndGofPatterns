package gof.behavioral.state;

public class StartState implements State {
    private StateContext stateContext;

    public StartState(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    @Override
    public void doSmth() {
        System.out.println("Start state");
        stateContext.changeState(new ThisState(stateContext));
    }

}
