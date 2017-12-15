public class SelectionSort extends Sort {

    /**
     *
     */
    public static void sort(Comparable[] a){
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(less(a[j], a[min])) {
                    min = j;
                }
            }

            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {11, 4, 8, 2, 3, 1, 9, 5};
        show(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
