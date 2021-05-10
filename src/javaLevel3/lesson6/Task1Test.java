package javaLevel3.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

class Task1Test {
    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowIllegalArgumentExceptionWhenEmptyArrayPassed(int[] emptyArray) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.afterLastFour(emptyArray));
    }
    @Test
    void shouldThrowRuntimeExceptionWhenNoFourFoundInArray() {
        Assertions.assertThrows(RuntimeException.class, () -> Task1.afterLastFour(new int[] {1}));
    }
    @ParameterizedTest
    @MethodSource("validArrayParameterProvider")
    void shouldThrowRuntimeExceptionWhenEmptyArrayPassed(int[] inputArray, int[] expected) {
        Assertions.assertArrayEquals(expected, Task1.afterLastFour(inputArray));
    }
    private static Stream<Arguments> validArrayParameterProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 1}, new int[] {1}),
                Arguments.of(new int[]{4, 2, 4, 2, 8, 1, 7}, new int[] {2, 8, 1, 7}),
                Arguments.of(new int[]{1, 4, 6, 1, 2, 9, 8, 2}, new int[] {6, 1, 2, 9, 8, 2})
        );
    }

}