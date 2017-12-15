import java.util.Iterator;

public class LinkedListQueue<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> last;
    private int n;

    private static class Node<T> {
        T item;
        Node<T> next;
    }

    public void enqueue(T item) {
        Node<T> temp = last;
        last = new Node<T>();
        last.item = item;
        last.next = null;
        if(isEmpty()) {
            first = last;
        } else {
            temp.next = last;
        }

        n++;
    }

    public T dequeue() {
        T item = first.item;
        first = first.next;
        n--;
        if(isEmpty()) {
            last = null;
        }

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
