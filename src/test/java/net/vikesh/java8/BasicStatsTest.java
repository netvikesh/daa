package net.vikesh.java8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author vikesh
 */
public class BasicStatsTest {
    @Test
    public void averageTest() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BasicStats stats = new BasicStats();
        double average = stats.average(Arrays.asList(input));
        assertEquals(5.5, average, 0.0);
    }
    @Test
    public void sumTest() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BasicStats stats = new BasicStats();
        double average = stats.sum(Arrays.asList(input));
        assertEquals(55, average, 0.0);
    }@Test
    public void minTest() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BasicStats stats = new BasicStats();
        double average = stats.min(Arrays.asList(input));
        assertEquals(1, average, 0.0);
    }@Test
    public void maxTest() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BasicStats stats = new BasicStats();
        double average = stats.max(Arrays.asList(input));
        assertEquals(10, average, 0.0);
    }
}
