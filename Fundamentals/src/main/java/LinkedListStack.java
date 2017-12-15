import java.util.Iterator;

public class LinkedListStack<T> implements Iterable<T> {
    private Node<T> first;
    private int n;

    private static class Node<T> {
        T item;
        Node<T> next;
    }

    public void push(T item) {
        Node<T> temp = first;
        first = new Node<T>();
        first.item = item;
        first.next = temp;
        n++;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        n--;

        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;

            return item;
        }

        @Override
        public void remove() {}
    }
}
