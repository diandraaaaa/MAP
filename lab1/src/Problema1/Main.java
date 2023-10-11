package Problema1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = {84, 29, 38, 43, 55};
        Note note= new Note();
        int[] insufficient = note.insufficientGrades(grades);
        double average = note.averageValue(grades);
        int[] rounded = note.roundGrades(grades);
        int maxGrade = note.maxGrade(grades);

        // Display the results
        System.out.println("Insufficient Grades: " + Arrays.toString(insufficient));
        System.out.println("Average Grade: " + average);
        System.out.println("Rounded Grades: " + Arrays.toString(rounded));
        System.out.println("Maxim Grade: " + maxGrade);
    }
}
