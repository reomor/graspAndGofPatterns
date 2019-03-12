package gof.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        Collection<Integer> collection = new PayloadCollection<>();
        collection.add(4);
        collection.add(3);
        collection.add(2);
        collection.add(1);
        final Iterator<Integer> iterator = collection.getIterator();
        while(iterator.hasNext()) {
            final Integer next = iterator.getNext();
            System.out.println("Next is: " + next);
        }
    }
}
