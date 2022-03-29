package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public class Programmer {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private Supplier<LocalDate> todaysDate;

    protected Programmer(String firstName, String lastName,
                      LocalDate birthDate,
                      Supplier<LocalDate> todaysDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.todaysDate = todaysDate;
    }

    protected Programmer(String firstName, String middleName,
                      String lastName, LocalDate birthDate,
                      Supplier<LocalDate> todaysDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.todaysDate = todaysDate;
    }

    public Optional<String> getMiddleName() {
        return Optional.of(middleName);
    }

    public static Programmer of(String firstName,
                                String lastName,
                                LocalDate birthDate) {
        return new Programmer(firstName,
            lastName, birthDate, LocalDate::now);
    }

    public static Programmer of(String firstName,
                                String middleName,
                                String lastName,
                                LocalDate birthDate) {
            return new Programmer(firstName, middleName,
                lastName, birthDate, LocalDate::now);
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public int getAge() {
        return (int) YEARS.between(birthDate, todaysDate.get());
    }
}
