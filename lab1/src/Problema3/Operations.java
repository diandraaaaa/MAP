package Problema3;

public class Operations{

    public static int[] addLargeNumbers(int[] num1, int[] num2) {
        if (num1.length == 0 || num2.length != num1.length) {
            throw new IllegalArgumentException("Invalid arrays");
        }

        int[] result = new int[num1.length + 1];
        int carry = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;

        return result;
    }

    public static int[] subLargeNumbers(int[] num1, int[] num2) {
        if (num1.length == 0 || num2.length != num1.length) {
            throw new IllegalArgumentException("Invalid arrays");
        }

        int[] result = new int[num1.length];
        int borrow = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    public static int[] multiplyLargeNumber(int[] num, int digit) {
        int carry = 0;
        int[] result = new int[num.length];

        for (int i = num.length - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        return result;
    }

    public static int[] divLargeNumber(int[] num, int divisor) {
        int remainder = 0;
        int[] result = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            int dividend = remainder * 10 + num[i];
            result[i] = dividend / divisor;
            remainder = dividend % divisor;
        }

        return result;
    }
}