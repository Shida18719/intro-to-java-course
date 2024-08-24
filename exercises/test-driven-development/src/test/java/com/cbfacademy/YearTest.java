package com.cbfacademy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class YearTest {

    // Leap Year Checker Test
    
    // @Test
    // @DisplayName("Year divisible by 400 return true")

    // public void divisibleBy400() {
    //     Year year = new Year(2000);
    //     boolean isLeap = year.isLeapYear();

    //      assertThat(isLeap, is(true));
    // }

    // @Test
    // @DisplayName("Year divisible by 100 but not by 400 return false")

    // public void divisibleBy100ButNot400() {
    //     Year year = new Year(1900);
    //     boolean isLeap = year.isLeapYear();

    //      assertThat(isLeap, is(false));
    // }

    // @Test
    // @DisplayName("Year divisible by 4, but not by 100 return true")

    // public void divisibleBy4ButNot100() {
    //     Year year = new Year(1996);
    //     boolean isLeap = year.isLeapYear();

    //      assertThat(isLeap, is(true));
    // }

    // @Test
    // @DisplayName("Year not divisible by 4 return false")

    // public void notDivisibleBy4() {
    //     Year year = new Year(1997);
    //     boolean isLeap = year.isLeapYear();

    //      assertThat(isLeap, is(false));
    // }


    // Refactored Leap Year Checker Test

    static Stream<Arguments> LeapYearIOProvider() {
        return Stream.of(
            Arguments.of(1700, false),
            Arguments.of(1800, false),
            Arguments.of(1900, false),
            Arguments.of(2000, true),
            Arguments.of(2001, false),
            Arguments.of(2002, false),
            Arguments.of(2003, false),
            Arguments.of(2004, true),
            Arguments.of(2005, false),
            Arguments.of(2006, false),
            Arguments.of(2007, false),
            Arguments.of(2008, true),
            Arguments.of(2009, false),
            Arguments.of(2010, false),
            Arguments.of(2011, false)
        );
    }

    @ParameterizedTest
    @MethodSource("LeapYearIOProvider")
    @DisplayName("Check whether a given Year is a Leap Year or not")

    void checkLeapYear(Integer n, boolean expected) {
        Year isLeap = new Year(n);
        assertThat(isLeap.isLeapYear(), is(expected));
    }
}
    

