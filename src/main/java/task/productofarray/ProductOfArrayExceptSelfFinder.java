package task.productofarray;

import java.util.Arrays;

import static task.productofarray.ArithmeticWithoutDivisionOrMultiplying.divideUsingSubtraction;

public class ProductOfArrayExceptSelfFinder {
    int[] productOfArrayExceptSelf(int[] input) {
        int arrayProduct = arrayProduct(input);

        for (int i = 0; i < input.length; i++) {
            input[i] = divideUsingSubtraction(arrayProduct, input[i]); //Nonsense!
        }

        return input;
    }

    private int arrayProduct(int[] input) {
        int product = 1;
        for (int i : input) {
            product *= i;
        }
        return product;
    }

    int[] productOfArrayExceptSelf2(int[] nums) {
        if (nums.length == 1) return new int[]{nums[0]};
        int[] result = new int[nums.length];

        int currentProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            currentProduct *= nums[i];
            result[i] = currentProduct;
        }

        int rightProduct = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            if (i == result.length - 1) {
                result[result.length - 1] = result[result.length - 2];
                rightProduct *= nums[i];
                continue;
            }

            if (i == 0) {
                result[0] = rightProduct;
                continue;
            }

            result[i] = rightProduct * result[i - 1];
            rightProduct = rightProduct * nums[i];
        }

        return result;
    }

    //1,2,3
    //1,2,6
    //12, 12, 6

    //6, 3, 2

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelfFinder().productOfArrayExceptSelf2(new int[]{1, 2, 3})));
    }
}
