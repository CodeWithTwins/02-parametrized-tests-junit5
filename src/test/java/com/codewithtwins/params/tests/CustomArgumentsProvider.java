package com.codewithtwins.params.tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        System.out.println("Arguments provider to test " + context.getTestMethod().get().getName());
        return Stream.of(Arguments.of("Head First Java", 49.99), Arguments.of("Clean Architecture", 39.99));
    }
}