package gof.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Manager manager = new Manager("Mike");
        manager.addObserver(new Teammate("Alex"));
        manager.addObserver(new Teammate("Anna"));
        manager.notifyObservers("Work!");
    }
}
