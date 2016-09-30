package net.vikesh.search;

/**
 * @author vikesh
 *         Searching in the given input array.
 */
public class LinearSearch {
    /**
     * Returns the index at which the key was found. If not found then returns -1;
     *
     * @param key
     * @param A
     * @return
     */
    public int search(int key, int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
