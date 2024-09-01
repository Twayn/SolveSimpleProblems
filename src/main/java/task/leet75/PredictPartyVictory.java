package task.leet75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        Deque<Integer> direQ = new LinkedList<>();
        Deque<Integer> radiantQ = new LinkedList<>();

        final char[] asArray = senate.toCharArray();
        for (int i = 0; i < senate.length(); i++) {
            if (asArray[i] == 'D'){
                direQ.offer(i);
            } else {
                radiantQ.offer(i);
            }
        }

        int priority = senate.length();

        while (!direQ.isEmpty() && !radiantQ.isEmpty()) {
            final Integer dire = direQ.peekFirst();
            final Integer radiant = radiantQ.peekFirst();

            if (dire < radiant) {
                direQ.offer(priority++);
            } else {
                radiantQ.offer(priority++);
            }

            radiantQ.poll();
            direQ.poll();
        }

        return direQ.isEmpty() ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println(new PredictPartyVictory().predictPartyVictory("DDRRR"));
//        System.out.println(new PredictPartyVictory().predictPartyVictory("DDR"));

//        System.out.println(new PredictPartyVictory().predictPartyVictory("RD"));
//        System.out.println(new PredictPartyVictory().predictPartyVictory("RDD"));
//        System.out.println(new PredictPartyVictory().predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }
}
