package Problema1;

import Problema3.Operations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";
    private Note note;

    @BeforeEach
    public void setUp() {
        note = new Note();
    }

    @Test
    public void shouldReturnInsufficientGrades() {
        int[] grades = {84, 29, 38, 43, 55};
        int[] expectedInsufficient = {29, 38};

        assertArrayEquals(expectedInsufficient, note.insufficientGrades(grades), SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int[] result = note.insufficientGrades(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void avrageValueTest(){
        int[] grades = {84, 29, 38, 43, 55};
        double result = 49.8;
        assertEquals(result, note.averageValue(grades), 0.1);


        try {
            int[] emptyArray = {};
            double result1 = note.averageValue(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void roundGradesTest(){
        int[] grades = {84, 29, 38, 43, 55};
        int[] rounded = {85, 29, 40, 45, 55};
        assertArrayEquals(rounded, note.roundGrades(grades), SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int[]  result = note.roundGrades(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }

    @Test void maxGradeTest(){
        int[] grades = {84, 29, 38, 43, 55};
        assertEquals(85, note.maxGrade(grades), SHOULD_BE_EQUAL);

        try {
            int[] emptyArray = {};
            int result = note.maxGrade(emptyArray);
        } catch (IllegalArgumentException e) {
            assertEquals("Empty array", e.getMessage());
        }
    }
}
