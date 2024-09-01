package task.leet75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class RecentCounter {
    ArrayDeque<Integer> queue = new ArrayDeque<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        queue.offer(t);

        while (queue.peek() != null && !(queue.peek() >= t - 3000 && queue.peek() <= t)) {
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        System.out.println(counter.ping(1)); //1
        System.out.println(counter.ping(100)); //2
        System.out.println(counter.ping(3001)); //3
        System.out.println(counter.ping(3002)); //3
    }
}
