public class InsertionSort extends Sort {

    /**
     * The running time depends on the initial order of the input. Effective if already mostly sorted.
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
