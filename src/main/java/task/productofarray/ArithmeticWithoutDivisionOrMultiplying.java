package task.productofarray;

public class ArithmeticWithoutDivisionOrMultiplying {

    static int multiplyUsingAdd(int multiplier1, int multiplier2) {
        int result = 0;

        int sign = -1;
        if ((multiplier1 > 0 && multiplier2 > 0) || multiplier1 < 0 && multiplier2 < 0) {
            sign = 1;
        }

        multiplier1 = Math.abs(multiplier1);
        multiplier2 = Math.abs(multiplier2);

        for (int i = 0; i < multiplier2; i++) {
            result += multiplier1;
        }

        return result * sign;
    }

    static int divideUsingSubtraction(int divisible, int divisor) {
        int result = 0;

        int sign = -1;
        if ((divisible > 0 && divisor > 0) || divisible < 0 && divisor < 0) {
            sign = 1;
        }

        divisible = Math.abs(divisible);
        divisor = Math.abs(divisor);

        while (divisible > 0) {
            divisible -= divisor;
            result++;
        }

        return result * sign;
    }
}
