import edu.princeton.cs.introcs.StdRandom;

public class Quick extends Sort {
    private final static int CUTOFF = 10;

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if(hi <= lo) {
            //Insertion.sort(a, lo, hi); TODO
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while(true) {
            while(less(a[++i], v)) {
                if(i == hi) {
                    break;
                }
            }

            while(less(v, a[--j])) {
                if(j == lo) {
                    break;
                }
            }

            if(i >= j) {
                break;
            }

            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }
}
