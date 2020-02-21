/**
 * code for quick sort
 */

public class QuickSort implements SortingAlgorithm {
    public void sort(int[] a) {
        qs(a, 0, a.length - 1);

    }

    public void qs(int[] a, int start, int end) {
        if (start > end) {
            // do nothing
            return;
        }
        int p = partition(a, start, end);
        if (p - 1 > start)
            qs(a, start, p - 1);
        if (p + 1 < end)
            qs(a, p + 1, end);
    }

    public static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        for (int i = start; i < end; i++) {
            if (a[i] < pivot) {
                int temp = a[start];
                a[start] = a[i];
                a[i] = temp;
                start++;
            }
        }
        //swap function...well just what u use to swap
        int temp = a[start];
        a[start] = pivot;
        a[end] = temp;

        return start;
    }

    // public int swap(int[] a, int i, int j) {
    // int temp = a[i];
    // a[i] = a[j];
    // a[j] = temp;
    // return i;
    // }

}