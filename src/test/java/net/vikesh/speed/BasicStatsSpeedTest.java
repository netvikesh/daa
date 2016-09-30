package net.vikesh.speed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Vikesh on 30-Sep-16.
 */
public class BasicStatsSpeedTest {
    private static final List<Integer> integers = new ArrayList<>();

    static {
        Random random = new Random();
        for (int i = 0; i <= 1000000; i++) {
            integers.add(random.nextInt());
        }
    }

    public static void main(String[] args) {
        List<Long> java8SumTimes = new ArrayList<>();
        List<Long> java8AverageTimes = new ArrayList<>();

        List<Long> pre8SumTimes = new ArrayList<>();
        List<Long> pre8AverageTimes = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            net.vikesh.java8.BasicStats java8Stats = new net.vikesh.java8.BasicStats();
            net.vikesh.pre8.BasicStats preStats = new net.vikesh.pre8.BasicStats();
            long java8StartAverage = System.nanoTime();
            double average = java8Stats.average(integers);
            long java8EndAverage = System.nanoTime();
            long java8StartSum = System.nanoTime();
            double sum = java8Stats.sum(integers);
            long java8EndSum = System.nanoTime();
            java8AverageTimes.add(java8EndAverage - java8StartAverage);
            java8SumTimes.add(java8EndSum - java8StartSum);

            long pre8StartAverage = System.nanoTime();
            double pre8Avg = preStats.average(integers);
            long pre8EndAverage = System.nanoTime();
            long pre8StartSum = System.nanoTime();
            double pre8Sum = preStats.sum(integers);
            long pre8EndSum = System.nanoTime();
            pre8SumTimes.add(pre8EndAverage - pre8StartAverage);
            pre8AverageTimes.add(pre8EndSum - pre8StartSum);
        }

        System.out.println("Java8 Average took:"+ java8AverageTimes.parallelStream().collect(Collectors.summarizingLong(e->e)).getAverage());
        System.out.println("Pre8  Average took:"+ pre8AverageTimes.parallelStream().collect(Collectors.summarizingLong(e->e)).getAverage());
        System.out.println("Java8 Sum     took:"+ java8SumTimes.parallelStream().collect(Collectors.summarizingLong(e->e)).getAverage());
        System.out.println("Pre8  Sum     took:"+ pre8SumTimes.parallelStream().collect(Collectors.summarizingLong(e->e)).getAverage());
    }
}
