import javax.lang.model.util.ElementScanner6;

/**
 * code for merge sort
 */

public class MergeSort implements SortingAlgorithm {

    public void sort(int[] a) {
        int arr = a.length;
        // basecase
        if (arr < 2)
            return;
        // sets the sizes base on a[]
        int leftSize = a.length / 2;
        int rightSize = a.length - leftSize;
        // creats temp arrays for the split
        int left[] = new int[leftSize];
        int right[] = new int[rightSize];
        // copies values on to temp arrays
        System.arraycopy(a, 0, left, 0, leftSize - 1);
        System.arraycopy(a, leftSize, right, 0, rightSize);

        sort(left);

        sort(right);
        merge(a, left, right);

    }

    public void merge(int[] target, int[] left, int[] right) {
        // counters
        int indexL = 0, indexR = 0;
        int indexTarget = 0;
        // deals with merging the arrays
        while (indexL < left.length && indexR < right.length) {
            if (left[indexL] < right[indexR])
                target[indexTarget++] = left[indexL++];
            else
                target[indexTarget++] = right[indexR++];

        }
        // the next two while deals with adding in any leftover from the while above
        while (indexL < left.length) {
            target[indexTarget++] = left[indexL++];
        }
        while (indexR < right.length)
            target[indexTarget++] = right[indexR++];
    }
}
