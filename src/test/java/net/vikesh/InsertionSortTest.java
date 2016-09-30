package net.vikesh;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author vikesh
 */
public class InsertionSortTest {

    @Test
    public void sortTest() {
        InsertionSort sorter = new InsertionSort();
        int[] input = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] output = sorter.sort(input);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, output);
    }
}
