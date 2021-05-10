package javaLevel3.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.Collection;

class Task2Test {
    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowIllegalArgumentExceptionWhenEmptyArrayPassed(int[] emptyArray) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.onlyOneAndFour(emptyArray));
    }

    @Test
    void shouldThrowRuntimeExceptionWhenNoOneAndFourFoundInArray() {
        Assertions.assertThrows(RuntimeException.class, () -> Task2.onlyOneAndFour(new int[]{8, 32, 7, 2}));
    }

    @ParameterizedTest
    @MethodSource("validArrayParameterProvider")
    void shouldThrowRuntimeExceptionWhenEmptyArrayPassed(int[] inputArray, boolean out) {
        Assertions.assertEquals(out, Task2.onlyOneAndFour(inputArray));
    }

    private static Collection<Object[]> validArrayParameterProvider() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4}, true},
                {new int[]{1, 14, 61}, false},
                {new int[]{1, 2, 5, 6, 22, 12}, false},
                {new int[]{4, 8, 7, 55, 11}, false}
        });
    }
}