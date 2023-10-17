package Problema2;

import Problema1.Note;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";
    private Numbers num;

    @BeforeEach
    public void setUp() {
        num = new Numbers();
    }

    @Test void maxNumberTest() {
        int[] numbers = {4, 8, 3, 10, 17};
        assertEquals(17, num.maxNumber(numbers), SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int result = num.maxNumber(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }
    @Test void minNumberTest(){
        int[] numbers = {4, 8, 3, 10, 17};
        assertEquals(3, num.minNumber(numbers),SHOULD_BE_EQUAL);
        try {
            int[] emptyArray = {};
            int result = num.minNumber(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void maxSumTest(){
        int[] numbers = {4, 8, 3, 10, 17};
        assertEquals(39, num.maxSum(numbers), SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int result = num.maxSum(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void minSumTest(){
        int[] numbers = {4, 8, 3, 10, 17};
        assertEquals(25, num.minSum(numbers), SHOULD_BE_EQUAL);
        try {
            int[] emptyArray = {};
            int result = num.minSum(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }
}
