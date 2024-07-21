package task.leet75;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            stack.push(asteroid);

            boolean collidePossible = true;
            while (collidePossible && stack.size() > 1) {
                Integer right = stack.pop();
                Integer left = stack.pop();

                if (left > 0 && right < 0) { // going to collide
                    if (Math.abs(left) == Math.abs(right)) {
                        collidePossible = false;
                    } else if (Math.abs(left) > Math.abs(right)) {
                        stack.push(left);
                    } else {
                        stack.push(right);
                    }
                } else {
                    stack.push(left);
                    stack.push(right);
                    collidePossible = false;
                }
            }
        }

        AtomicInteger counter = new AtomicInteger();
        final int[] result = new int[stack.size()];
        stack.descendingIterator().forEachRemaining(item -> result[counter.getAndIncrement()] = item);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new AsteroidCollision().asteroidCollision(new int[]{-2, 2})));
    }
}
