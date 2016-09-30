package net.vikesh;

/**
 * @author vikesh
 *         MergeSort Implementation. This is MergeSort using Sentinel.
 */
public class MergeSort {
    public int[] sort(final int[] A) {
        if (A == null || (A != null & A.length <= 1)) {
            return A;
        }
        int p = 0;
        int r = A.length - 1;
        mergeSort(A, p, r);
        return A;
    }

    private void mergeSort(final int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private void merge(int[] A, int p, int q, int r) {
        //length of Left Array is q-p
        //If p is 0 and q is 5, the left sub array size is 6 = 5-0 + 1
        //If p is > 0 say p is 3 and q is 8. They array size is 5 = p - q
        int n1 = q == 0 ? q - p + 1 : p - q; //Remember these are lengths
        int n2 = r - p;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        for (int j = 1; j < n2; j++) {
            R[j] = A[q + j];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }
}
