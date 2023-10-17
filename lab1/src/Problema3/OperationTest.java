package Problema3;

import Problema2.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";

    @Test void addLargeNumbersTest(){
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] resultSum = Operations.addLargeNumbers(num1, num2);
        int[] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, resultSum, SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int[] result = Operations.addLargeNumbers(emptyArray, num2);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void subLargeNumbersTest(){
        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] resultDiff = Operations.subLargeNumbers(num3, num4);
        int[] expected = {2, 9, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, resultDiff, SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int[] result = Operations.subLargeNumbers(emptyArray, num4);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void multiplyLargeNumberTest(){
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;

        int[] resultProduct = Operations.multiplyLargeNumber(num5, digit);
        int[] expected = {4, 7, 2, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, resultProduct, SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int[] result = Operations.multiplyLargeNumber(emptyArray, digit);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }
    @Test void divLargeNumberTest(){
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int divisor = 2;

        int[] resultDivision = Operations.divLargeNumber(num5, divisor);
        int[] expected = {1, 1, 8, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, resultDivision, SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int[] result = Operations.divLargeNumber(emptyArray, divisor);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }
}
