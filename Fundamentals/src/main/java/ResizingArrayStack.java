import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] a = (T[]) new Object[1];
    private int n;

    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for(int i = 0; i < n; i++) {
            temp[i] = a[i];
        }

        a = temp;
    }

    public void push(T item) {
        if(n == a.length) {
            resize(2 * a.length);
        }

        a[n++] = item;
    }

    public T pop() {
        T item = a[--n];
        a[n] = null;
        if(n > 0 && n == a.length / 4) {
            resize(a.length / 2);
        }

        return item;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = n - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public T next() {
            return a[i--];
        }

        @Override
        public void remove() {}
    }
}
