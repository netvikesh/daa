package net.vikesh.java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vikesh
 */
public class BasicStats {
    public double average(List<Integer> list) {
        return list.parallelStream().collect(Collectors.summarizingInt(e -> e)).getAverage();
    }

    public double min(List<Integer> list) {
        return list.parallelStream().collect(Collectors.summarizingInt(e -> e)).getMin();
    }

    public double max(List<Integer> list) {
        return list.parallelStream().collect(Collectors.summarizingInt(e -> e)).getMax();
    }

    public double sum(List<Integer> list) {
        return list.parallelStream().collect(Collectors.summarizingInt(e -> e)).getSum();
    }

}
