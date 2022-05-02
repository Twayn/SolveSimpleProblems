package task.firstduplicate;

public class FirstDuplicateFinder {

    /*Second member of duplicate pair occurs later than any other
     * Array contains only elements from 1 to array.length*/
    public int firstDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[Math.abs(a[i]) - 1] < 0){
                return Math.abs(a[i]);
            } else {
                a[Math.abs(a[i]) - 1] = - a[Math.abs(a[i]) - 1];
            }
        }
        return -1;
    }
}
