package com.codewithtwins.params.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;
import static org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ALL;

public class EnumSourceParamTest {

    enum BookGenre {
        ACTION,
        ADVENTURE,
        CLASSICS,
        SELFHELP,
        PROGRAMMING
    }

    @ParameterizedTest
    @EnumSource(BookGenre.class)
    void testWithEnum(BookGenre argument) {
        System.out.println("Parameterized test with (BookGenres) argument: " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @EnumSource(value = BookGenre.class, names = { "ACTION", "PROGRAMMING" })
    void testWithFilteredEnum(BookGenre argument) {
        System.out.println("Parameterized test with some (BookGenre) argument: "+ argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @EnumSource(value = BookGenre.class, mode = EXCLUDE, names = { "SELFHELP", "CLASSICS" })
    void testWithExcludeEnum(BookGenre argument) {
        System.out.println("Parameterized test with excluded (BookGenre) argument: " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @EnumSource(value = BookGenre.class, mode = MATCH_ALL, names = "^CLASSICS$")
    void testWithRegexEnum(BookGenre argument) {
        System.out.println("Parameterized test with regex filtered (BookGenre) argument: " + argument);
        assertNotNull(argument);
    }


}
