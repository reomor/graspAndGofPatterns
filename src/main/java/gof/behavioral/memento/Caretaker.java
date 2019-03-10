package gof.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private final Originator originator;
    private Stack<Memento> history = new Stack<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void doSomething() {
        final Memento memento = originator.saveState();
        System.out.println("Current state is: " + memento.getState());
        history.push(memento);
    }

    public void undo() {
        if (history.size() > 0) {
            final Memento memento = history.pop();
            System.out.println("Current state is: " + memento.getState());
            originator.restoreState(memento);
        }
    }
}
