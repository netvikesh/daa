package net.vikesh.pre8;

import java.util.Collections;
import java.util.List;

/**
 * @author Vikesh
 */
public class BasicStats {
    /**
     * Find the average
     *
     * @param list
     * @return
     */
    public double average(List<Integer> list) {
        double sum = 0.0;
        for (Integer value : list) {
            sum += value;
        }
        return sum / list.size();
    }

    /**
     * Find the min
     *
     * @param list
     * @return
     */
    public double min(List<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }

    /**
     * @param list
     * @return
     */
    public double max(List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public double sum(List<Integer> list) {
        double sum = 0.0;
        for (Integer value : list) {
            sum += value;
        }
        return sum;
    }
}
