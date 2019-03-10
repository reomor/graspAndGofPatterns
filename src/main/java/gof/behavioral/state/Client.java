package gof.behavioral.state;

public class Client {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.doThis();
        stateContext.doThis();
        stateContext.doThis();
        stateContext.doThis();
    }
}
