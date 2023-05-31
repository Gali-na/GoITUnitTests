package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class SumCalculatorTest {
    SumCalculator calculator;

    @BeforeEach
    void createCalculator() {
        calculator = new SumCalculator();
    }

    @Test
    void sumArgumentZeroTrowException() {
        assertThrows(IllegalAccessException.class, () -> calculator.sum(0));

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void sumArgumentLessZeroTrowException(int argument) {
        assertThrows(IllegalAccessException.class, () -> calculator.sum(argument));
    }

    @DisplayName("sum_Positiv_ArgumentInValidRange")
    @ParameterizedTest
    @CsvSource({"1,1", "2,3", "3,6", "4,10", "5,15", "6,21", "7,28", "8,36"
    })
    void sumCalculateTotalPositive(int argument, int rezult) throws IllegalAccessException {
        assertEquals(rezult, calculator.sum(argument));
    }

    @ParameterizedTest
    @ValueSource(ints = {1_000_301, 1_000_302, 1_000_302})
    void sumArgumentMore1_000_300TrowException(int argument) {
        assertThrows(IllegalAccessException.class, () -> calculator.sum(argument));
    }
}