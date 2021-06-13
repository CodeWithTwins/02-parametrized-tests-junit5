package com.codewithtwins.params.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArgumentsSourceParamTest {
    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsProvider.class)
    void testWithArgumentsSource(String title, double price) {
        System.out.println("Parameterized test with (String) " + title + " and (double) " + price);
        assertNotNull(title);
        assertTrue(price > 0);
    }
}