package task.reverseinteger;

public class IntegerReverser {
    int reverse(int input) {
        int reversed = 0;

        while (input != 0) {
            final int digit = input % 10;
            reversed = reversed * 10 + digit;
            input = input / 10;
        }

        return reversed;
    }
}
