package Problema2;

public class Numbers {
    public int maxNumber(int[] numbers) {
        if(numbers.length==0){
            throw new IllegalArgumentException("Empty array");
        }

        int max = 0;

        for (int numer : numbers) {
            if (max < numer) {
                max = numer;
            }
        }

        return max;
    }

    public int minNumber(int[] numbers) {
        if(numbers.length==0){
            throw new IllegalArgumentException("Empty array");
        }

        int min = 1000000;

        for (int numer : numbers) {
            if (min > numer) {
                min = numer;
            }
        }

        return min;
    }

    public int maxSum(int[] numbers) {
        if(numbers.length==0){
            throw new IllegalArgumentException("Empty array");
        }

        int sum = 0;

        for (int numer : numbers) {
            sum += numer;
        }

        return sum - minNumber(numbers);
    }

    public int minSum(int[] numbers) {
        if(numbers.length==0){
            throw new IllegalArgumentException("Empty array");
        }

        int sum = 0;

        for (int numer : numbers) {
            sum += numer;
        }

        return sum - maxNumber(numbers);
    }
}