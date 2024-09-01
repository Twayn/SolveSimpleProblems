package task.leet75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FrequencySort {
    public int[] frequencySort(int[] nums) {
        final Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(groupingBy(identity(), counting()));

        List<Entry<Integer, Long>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.<Integer, Long>comparingByValue().thenComparing(Entry.<Integer, Long>comparingByKey().reversed()));

        int[] result = new int[nums.length];
        int index = 0;

        for (final Entry<Integer, Long> entry : list) {
            for (int j = 0; j < entry.getValue(); j++) {
                result[index++] = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FrequencySort().frequencySort(new int[]{2,3,1,3,2})));
    }
}
