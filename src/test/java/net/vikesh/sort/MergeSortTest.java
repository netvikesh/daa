package net.vikesh.sort;

import net.vikesh.sort.MergeSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link MergeSort}
 */
public class MergeSortTest {

    @Test
    public void sortTest(){
        MergeSort sorter = new MergeSort();
        int[] input = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] output = sorter.sort(input);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, output);
    }
}
