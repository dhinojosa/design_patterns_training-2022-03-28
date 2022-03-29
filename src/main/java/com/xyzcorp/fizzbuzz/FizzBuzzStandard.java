package com.xyzcorp.fizzbuzz;

public class FizzBuzzStandard implements FizzBuzz {
    String calculate(int number) {
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }

}
