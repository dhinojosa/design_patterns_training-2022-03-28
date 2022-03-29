package com.xyzcorp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {


    @Test
    void testFizzBuzzOf1Is1() {
        String result = FizzBuzz.calculate(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void testFizzBuzzOf2Is2() {
        String result = FizzBuzz.calculate(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void testFizzBuzzOf3IsFizz() {
        String result = FizzBuzz.calculate(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
