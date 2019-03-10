package gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Observable{
    private String name;
    private List<Observer> teammateList = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        teammateList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        teammateList.remove(observer);
    }

    @Override
    public void notifyObservers(String command) {
        teammateList.forEach(observer -> observer.handleEvent(command));
    }
}
