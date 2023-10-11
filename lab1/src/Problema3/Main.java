package Problema3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] resultSum = Operations.addLargeNumbers(num1, num2);

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] resultDiff = Operations.subLargeNumbers(num3, num4);

        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digit = 2;
        int[] resultProduct = Operations.multiplyLargeNumber(num5, digit);

        int divisor = 2;
        int[] resultDivision = Operations.divLargeNumber(num5, divisor);

        // Display the results
        System.out.println("Sum: " + Arrays.toString(resultSum));
        System.out.println("Difference: " + Arrays.toString(resultDiff));
        System.out.println("Product: " + Arrays.toString(resultProduct));
        System.out.println("Division: " + Arrays.toString(resultDivision));
    }
}
