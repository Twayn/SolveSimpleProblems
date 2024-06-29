package task.flowerbed;

public class Flowerbed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int availableSlots = 0;
        int availableSequenceLength = 0;
        boolean sequenceInProgress = true;

        for (int i : flowerbed) {
            if (i == 0) {
                availableSequenceLength++;
            } else {
                if (availableSequenceLength > 2) {
                    if (availableSequenceLength % 2 == 0) {
                        availableSlots += (availableSequenceLength - 2) / 2;
                    } else {
                        availableSlots += (availableSequenceLength - 1) / 2;
                    }
                }
                availableSequenceLength = 0;
            }
        }

        return n <= availableSlots;
    }


    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int availableSlots = 0;

        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    availableSlots++;
                    i += 2;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        return n <= availableSlots;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers2(new int[]{1, 0, 0, 0, 1}, 1));
    }
}
