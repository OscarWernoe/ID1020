public class SortTest {

    public static void main(String[] args) {
        System.out.println("Selection");
        Integer[] a = {11, 4, 8, 2, 3, 1, 9, 5};
        Sort.show(a);
        Selection.sort(a);
        assert Sort.isSorted(a);
        Sort.show(a);

        System.out.println("Insertion");
        Integer[] b = {11, 4, 8, 2, 3, 1, 9, 5};
        Sort.show(b);
        Insertion.sort(b);
        assert Sort.isSorted(b);
        Sort.show(b);

        System.out.println("Shell");
        Integer[] c = {11, 4, 8, 2, 3, 1, 9, 5};
        Sort.show(c);
        Shell.sort(c);
        assert Sort.isSorted(c);
        Sort.show(c);

        System.out.println("Merge");
        Integer[] d = {11, 4, 8, 2, 3, 1, 9, 5};
        Sort.show(d);
        Merge.sort(d);
        assert Sort.isSorted(d);
        Sort.show(d);

        System.out.println("Quick");
        Integer[] e = {11, 4, 8, 2, 3, 1, 9, 5};
        Sort.show(e);
        Quick.sort(e);
        assert Sort.isSorted(e);
        Sort.show(e);
    }
}
