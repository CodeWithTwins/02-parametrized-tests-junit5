package com.codewithtwins.params.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ValueSourceParamTest {
    @ParameterizedTest
    @ValueSource(strings = {"code", "with", "twins"})
    void testWithStrings(String argument) {
        System.out.println("Parameterized test with String parameter: " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 3 })
    void testWithInts(int argument) {
        System.out.println("Parameterized test with int argument: " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @ValueSource(longs = { 4L, 5L, 6L })
    void testWithLongs(long argument) {
        System.out.println("Parameterized test with long argument: " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @ValueSource(doubles = { 7, 8, 9 })
    void testWithDoubles(double argument) {
        System.out.println("Parameterized test with double argument: " + argument);
        assertNotNull(argument);
    }
}
