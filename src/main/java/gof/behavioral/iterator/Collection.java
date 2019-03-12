package gof.behavioral.iterator;

public interface Collection<T> {
    void add(T element);
    T get(int index);
    Iterator<T> getIterator();
}
