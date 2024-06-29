package task.binarysearch;

public class BinarySearchIterating implements BinarySearch {
    public int find(int num, int[] array) {
        int notFound = -1;

        if (array.length == 0) return notFound;
        if (array.length == 1) return array[0] == num ? 0 : notFound;
        int maxNumberOfIterations = log2(array.length);

        int middle = array.length / 2;
        for (int i = 0; i < maxNumberOfIterations + 1; i++) {
            if (array[middle] == num) {
                return middle;
            } else if (num > array[middle]){
                middle = (middle + array.length) / 2;
            } else {
                middle = middle / 2;
            }

        }
        return notFound;
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

    static int log(int x, int base) {
        return (int) (Math.log(x) / Math.log(base));
    }

    static int log2(int x) {
        return log(x, 2);
    }

    public static void main(String[] args) {
        System.out.println(log2(2));
    }
}
