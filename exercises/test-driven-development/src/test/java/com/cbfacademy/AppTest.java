package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    // @Test
    // @DisplayName("creates the app")
    // public void createsAnApp() {
    //     final App app = new App();

    //     assertThat(app, is(notNullValue()));
    // }


    //FizzBuzz Test refactored

    static Stream<Arguments> StringAndIntprovider() {
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(2, "2"),
            Arguments.of(3, "Fizz"),
            Arguments.of(4, "4"),
            Arguments.of(5, "Buzz"),
            Arguments.of(6, "Fizz"),
            Arguments.of(7, "7"),
            Arguments.of(8, "8"),
            Arguments.of(9, "Fizz"),
            Arguments.of(10, "Buzz"),
            Arguments.of(11, "11"),
            Arguments.of(12, "Fizz"),
            Arguments.of(13, "13"),
            Arguments.of(14, "14"),
            Arguments.of(15, "FizzBuzz")
            
        );
    }

    @ParameterizedTest
    @MethodSource("StringAndIntprovider")
    @DisplayName("return the number as string")
    void returnNumberAsString(Integer n, String expected) {

        final String result = FizzBuzz.get(n);
        assertEquals(result, expected);
    }
        
}