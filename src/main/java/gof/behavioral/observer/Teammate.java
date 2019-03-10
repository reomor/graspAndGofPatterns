package gof.behavioral.observer;

public class Teammate implements Observer {
    private String name;

    public Teammate(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String command) {
        System.out.println(name + " got command: " + command);
    }
}
