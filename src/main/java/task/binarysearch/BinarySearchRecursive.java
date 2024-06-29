package task.binarysearch;

public class BinarySearchRecursive implements BinarySearch {
    public int find(int num, int[] array) {
        if (array.length == 0) return -1;
        return find(0, array.length - 1, num, array);
    }

    private int find(int start, int end, int num, int[] array) {
        if (array[start] == num) return start;
        if (array[end] == num) return end;
        if (end - start < 2) return -1;

        int middle = start + end / 2;
        if (array[middle] == num) {
            return middle;
        }

        if (num > array[middle]) {
            return find(middle + 1, end, num, array);
        } else {
            return find(start, middle - 1, num, array);
        }
    }

    public static void main(String[] args) {
        System.out.println(1 / 2);
    }

    private static double log(int base, int x) {
        return Math.log(x) / Math.log(base);
    }
}
