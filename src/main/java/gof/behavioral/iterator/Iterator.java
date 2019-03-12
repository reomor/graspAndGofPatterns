package gof.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T getNext();
}
