package task.productofarray;

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
}
