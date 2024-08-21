package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }


    @Test
    @DisplayName("print FizzBuzz for multiples of 15")
    public void printFizzBuzz() {

        final String result = FizzBuzz.get(15);
        assertEquals(result, "FizzBuzz");
    }


    @Test
    @DisplayName("print Fizz for multiples is 3")
    public void printFizz() {

        final String result = FizzBuzz.get(9);
        assertEquals(result, "Fizz");
    }

    @Test
    @DisplayName("print Buzz for multiples of 5")
    public void printBuzz() {

        final String result = FizzBuzz.get(10);
        assertEquals(result, "Buzz");
    }
}