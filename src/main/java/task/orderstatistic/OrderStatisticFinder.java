package task.orderstatistic;

public class OrderStatisticFinder {
    int firstOrderStatistic(int[] input) {
        int result = Integer.MAX_VALUE;

        for (int current : input) {
            if (current < result) {
                result = current;
            }
        }

        return result;
    }

    int secondOrderStatistic(int[] input) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int current : input) {
            if (current < min) {
                secondMin = min;
                min = current;
            } else if (current < secondMin){
                secondMin = current;
            }
        }

        return secondMin;
    }

//    int nthOrderStatistic(int[] input, int order) {
//        int result;
//
//        int numberOfLessElements = 0;
//        int numberOfGreaterElements = 0;
//        int numberOfEqualsElements = 0;
//
//        for (int i : input) {
//            if (i == order){
//                numberOfEqualsElements++;
//            } else if (i > order){
//                numberOfGreaterElements++;
//            } else {
//                numberOfLessElements++;
//            }
//        }
//
//
//        return secondMin;
//    }

}
