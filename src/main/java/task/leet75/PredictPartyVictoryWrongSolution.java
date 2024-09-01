package task.leet75;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class PredictPartyVictoryWrongSolution {
    public String predictPartyVictory(String senate) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        final char[] asArray = senate.toCharArray();
        for (char c : asArray) {
            stack.push(c);
        }

        Iterator<Character> iterator = stack.descendingIterator();

        for (; ; ) {
            final Result result = round(iterator);

            if (result.allElementsTheSame) {
                return result.iterator.next() == 'D' ? "Dire" : "Radiant";
            } else {
                iterator = result.iterator;
            }
        }
    }

    private Result round(Iterator<Character> iterator) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Set<Character> set = new HashSet<>();

        AtomicInteger direBalance = new AtomicInteger(0);
        AtomicInteger radiantBalance = new AtomicInteger(0);

        iterator.forEachRemaining(next -> {
            set.add(next);

            final Character peek = stack.peek();

            if (peek == null || peek == next) {
                if (next == 'D') {
                    direBalance.incrementAndGet();
                } else {
                    radiantBalance.incrementAndGet();
                }
                stack.push(next);
            } else {
                if (peek == 'D') {
                    if (direBalance.get() > 0) {
                        direBalance.decrementAndGet();
                    } else {
                        stack.pop();
                        stack.push(next);
                    }
                } else {
                    if (radiantBalance.get() > 0) {
                        radiantBalance.decrementAndGet();
                    } else {
                        stack.pop();
                        stack.push(next);
                    }
                }
            }
        });

        return new Result(set.size() == 1, stack.descendingIterator());
    }

    record Result(boolean allElementsTheSame, Iterator<Character> iterator) {
    }

    public static void main(String[] args) {
        System.out.println(new PredictPartyVictoryWrongSolution().predictPartyVictory("DDRRR"));
        System.out.println(new PredictPartyVictoryWrongSolution().predictPartyVictory("DDR"));

        System.out.println(new PredictPartyVictoryWrongSolution().predictPartyVictory("RD"));
        System.out.println(new PredictPartyVictoryWrongSolution().predictPartyVictory("RDD"));
        System.out.println(new PredictPartyVictoryWrongSolution().predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }
}
