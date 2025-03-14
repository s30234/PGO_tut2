package tasks;
import java.util.*;
public class task3 {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return array;
        positions %= n; // Handles full rotations
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + positions) % n] = array[i];
        }
        return rotated;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(arr, 2))); // Output: [4, 5, 1, 2, 3]
    }
}
