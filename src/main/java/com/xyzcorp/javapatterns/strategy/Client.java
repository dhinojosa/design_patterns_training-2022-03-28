package com.xyzcorp.javapatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:54 PM
 */
public class Client {

    public static void main(String[] args) {
        NumberAccumulator numberAccumulator = new NumberAccumulator();
        numberAccumulator.setAccumulatorStrategy(new ProductAccumulator());

        numberAccumulator.setAccumulatorStrategy((a, b) -> a * b);
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        assert numberAccumulator.accumulate(integers) == 24;

        Optional<Integer> reduce =
            Stream.of(1, 2, 3, 4).reduce((total, next) -> {
            System.out.printf("total: %d\tnext: %d\n", total, next);
            return total + next;
        });
        System.out.println(reduce);
    }
}
