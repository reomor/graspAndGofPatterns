package gof.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PayloadCollection<T> implements Collection<T> {
    private List<T> collection = new ArrayList<>();

    private class CollectionIterator<T> implements Iterator<T> {
        private T[] collection;
        private int currentPosition = 0;

        @SuppressWarnings("unchecked")
        public CollectionIterator(List<T> collection) {
            this.collection = (T[]) collection.toArray();
        }

        @Override
        public boolean hasNext() {
            return this.currentPosition < collection.length;
        }

        @Override
        public T getNext() {
            if (!hasNext()) {
                return null;
            }
            return collection[currentPosition++];
        }
    }

    @Override
    public void add(T element) {
        this.collection.add(element);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > collection.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        return this.collection.get(index);
    }

    @Override
    public Iterator<T> getIterator() {
        return new CollectionIterator<>(this.collection);
    }
}
