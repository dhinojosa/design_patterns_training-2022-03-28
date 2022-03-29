package com.xyzcorp.tdd;
import java.time.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgrammerTest {

    @Test
    void testBjarneFullName() {
        Programmer programmer =
            new Programmer("Bjarne", "Strousoup",
                LocalDate.of(1950, 12, 30),
                () -> LocalDate.of(2018, 6, 1));
        String fullName = programmer.getFullName();
        assertThat(fullName).isEqualTo("Bjarne Strousoup");
    }

    @Test
    void testGuidoFullName() {
        Programmer programmer =
            new Programmer("Guido", "Van Rossum",
                LocalDate.of(1956, 1, 31),
                () -> LocalDate.of(2018, 6, 1));
        String fullName = programmer.getFullName();
        assertThat(fullName).isEqualTo("Guido Van Rossum");
    }

    @Test
    void testBjarneStrousoupAge() {
        Programmer programmer =
            new Programmer("Bjarne", "Strousoup",
                LocalDate.of(1950, 12, 30),
                () -> LocalDate.of(2018, 6, 1));
        int age = programmer.getAge();
        assertThat(age).isEqualTo(67);
    }

    @Test
    void testGuidoAge() {
        Programmer programmer =
            new Programmer("Guido", "Van Rossum",
                LocalDate.of(1956, 1, 31),
                () -> LocalDate.of(2018, 6, 1));
        int age = programmer.getAge();
        assertThat(age).isEqualTo(62);
    }

    @Test
    void testMiddleNameOfProgrammer() {
        Programmer programmer =
            new Programmer("James", "Arthur",  "Gosling",
                LocalDate.of(1955, 5, 19),
                () -> LocalDate.of(2018, 6, 1));
    }

    @Test
    void testBjarneWithTodaysDate() {
        Programmer programmer =
            Programmer.of("Bjarne", "Strousoup",
                LocalDate.of(1950, 12, 30));
        assertThat(programmer).isNotNull();
        assertThat(programmer.getAge()).isPositive();
    }
}
