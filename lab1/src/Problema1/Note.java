package Problema1;

public class Note {
    // Method for insufficient grades
    public int[] insufficientGrades(int[] grades) {
        if(grades.length==0){
            throw new IllegalArgumentException("Empty array");
        }
        int countInsufficient = 0;

        for (int grade : grades) {
            if (grade < 40) {
                countInsufficient++;
            }
        }

        int[] insufficient = new int[countInsufficient];
        int index = 0;

        for (int grade : grades) {
            if (grade < 40) {
                insufficient[index++] = grade;
            }
        }

        return insufficient;
    }

    // Method for calculating the average grade
    public double averageValue(int[] grades) {
        if(grades.length==0){
            throw new IllegalArgumentException("Empty array");
        }
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    // Method for rounding grades
    public int[] roundGrades(int[] grades) {
        if(grades.length==0){
            throw new IllegalArgumentException("Empty array");
        }
        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38 || grades[i] % 5 < 3) {
                result[i] = grades[i];
            } else {
                result[i] = (grades[i] / 5 + 1) * 5;
            }
        }

        return result;
    }

    // Method for calculating the maximum rounded grade
    public int maxGrade(int[] grades) {
        if(grades.length==0){
            throw new IllegalArgumentException("Empty array");
        }
        int maxGrade = 0;

        for (int grade : roundGrades(grades)) {
            if (maxGrade < grade) {
                maxGrade = grade;
            }
        }

        return maxGrade;
    }
}