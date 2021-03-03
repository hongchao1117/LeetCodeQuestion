package Array;

import java.util.*;


public class randomArray {
    int[] original;
    int[] array;

    Random random = new Random();

    public randomArray(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return original;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapNum(i, randomRange(i, array.length));
        }
        return array;
    }

    private int randomRange(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public void swapNum(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
