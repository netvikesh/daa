package net.vikesh.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author vikesh
 */
public class LinearSearchTest {

    @Test
    public void shouldFind(){
        int[] input = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        LinearSearch searcher = new LinearSearch();
        int search = searcher.search(4, input);
        assertEquals(6, (int)search);
    }

    @Test
    public void shouldNotFind(){
        int[] input = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        LinearSearch searcher = new LinearSearch();
        int search = searcher.search(12, input);
        assertEquals(-1, search);
    }
}
