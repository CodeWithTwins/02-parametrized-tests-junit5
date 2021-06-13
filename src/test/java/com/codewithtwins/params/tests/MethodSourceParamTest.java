package com.codewithtwins.params.tests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MethodSourceParamTest {

    static Stream<String> stringProvider() {
        return Stream.of("Clean Code", "Effective Java");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithStringProvider(String argument) {
        System.out.println("Parameterized test with String argument: " + argument);
        assertNotNull(argument);
    }

    static Stream<Book> bookProvider() {
        Book cleanCode = new Book("Clean Code", 34.99);
        Book effectiveJava = new Book("Effective Java", 49.99);
        return Stream.of(cleanCode, effectiveJava);
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void testWithStringProvider(Book argument) {
        System.out.println("Parameterized test with Book argument: " + argument);
        assertNotNull(argument);
    }


    static class Book {
        String title;
        double price;

        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static Stream<Arguments> stringAndIntProvider() {
        return Stream.of(Arguments.of("Design Pattern in Java", 20),
                Arguments.of("Mastering JUnit 5", 20));
    }

    @ParameterizedTest
    @MethodSource("stringAndIntProvider")
    void testWithMultiArgMethodSource(String title, int price) {
        System.out.println("Parameterized test with two arguments: (String) " + title + " and (Price(Int)) " + price);
        assertNotNull(title);
        assertNotEquals(0, price);
    }


}

