package gof.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);
        caretaker.doSomething();
        originator.setState(OriginatorState.PENDING);
        caretaker.doSomething();
        originator.setState(OriginatorState.ON);
        caretaker.doSomething();
        caretaker.undo();
        caretaker.undo();
        caretaker.undo();
    }
}
