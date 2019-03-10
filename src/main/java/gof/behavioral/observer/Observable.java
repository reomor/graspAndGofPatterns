package gof.behavioral.observer;

// also known as Subject
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String command);
}
