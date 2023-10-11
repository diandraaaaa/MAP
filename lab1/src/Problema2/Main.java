package Problema2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 10, 17};
        Numbers num = new Numbers();

        System.out.println("Max Number: " + num.maxNumber(numbers));
        System.out.println("Min Number: " + num.minNumber(numbers));
        System.out.println("Max Sum of N-1 Numbers: " + num.maxSum(numbers));
        System.out.println("Min Sum of N-1 Numbers: " + num.minSum(numbers));
    }
}
