package net.vikesh.sort;

/**
 * @author vikesh
 *
 * Insertion Sort implementation following the Book Introduction to Algorithms
 */
public class InsertionSort {
    public int[] sort(final int[] input) {
        if (input.length == 0 || input.length == 1) {
            return input;
        }
        //Start from 2nd position - 1st index of the position
        for (int j = 1; j <= input.length - 1; j++) {
            //Assume that it is smallest yet
            int key = input[j];
            //Insert it in the sorted subsequence from i to j
            int i = j - 1;
            while (i >= 0 && input[i] > key) {
                //It means that value at i th postion is greater than key, copy the value to ahead of it
                input[i + 1] = input[i];
                i--;
            }
            //Here the value would be less than what i started at, for instance after first loop it would be -1
            input[i + 1] = key;
        }
        return input;
    }
}
