package task.leet75;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        System.out.println(new KthLargestElement().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
