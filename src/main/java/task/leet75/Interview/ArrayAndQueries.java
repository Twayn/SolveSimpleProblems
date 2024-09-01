package task.leet75.Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAndQueries {
    public int[] executeQueries(int[] array, List<Query> queries) {
        System.out.println(Arrays.toString(array));

        int[] prefixSumBefore = new int[array.length + 1];
        int[] prefixSumAfter = new int[array.length + 1];

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            prefixSumBefore[i + 1] = sum;
        }

        sum = 0;
        for (Query query : queries) {
            array[query.left] +=1;
            array[query.right + 1] -=1;
        }

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            prefixSumAfter[i + 1] = sum;
        }

        System.out.println(Arrays.toString(prefixSumBefore));
        System.out.println(Arrays.toString(prefixSumAfter));

        for (int i = 1; i < array.length; i++) {
            array[i-1] = prefixSumAfter[i] - prefixSumBefore[i-1];
        }

        return array;
    }

    public static record Query(int left, int right) {

    }

    public static void main(String[] args) {
//        System.out.println(
//            Arrays.toString(
//                new ArrayAndQueries()
//                    .executeQueries(
//                        new int[]{1, 2, 3, 4, 5},
//                        List.of(
//                            new Query(0, 2),
//                            new Query(1, 2),
//                            new Query(2, 3)
//                        )
//                    )
//            )
//        );

        System.out.println(
            Arrays.toString(
                new ArrayAndQueries()
                    .executeQueries(
                        new int[]{5, 1, 3, 2, 4, 0},
                        List.of(
                            new Query(2, 4)
                        )
                    )
            )
        );
/*
        1, 2, 3, 4, 5
        0, 1, 3, 6, 10
        2, 2, 3, 4, 5
        0, 1, 3, 6, 10

 */
    }
}
