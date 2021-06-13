package com.codewithtwins.params.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvParamTest {

    @ParameterizedTest
    @CsvSource({ "Clean Code, 34.99", "Effective Java, 49.99", "Head First Java, 39.99" })
    void testWithCsvSource(String title, double price) {
        System.out.println("Parameterized test with (String) " + title + " and (double) " + price);
        assertNotNull(title);
        assertNotEquals(0, price);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/books.csv")
    void testWithCsvFileSource(String title, double price) {
        System.out.println("Parameterized test using csv file with  (String) " + title + " and (double) " + price);
        assertNotNull(title);
        assertNotEquals(0, price);
    }
}
