package tasks;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
    int[] arr = {3, 3, 3, 2, 2};
    System.out.println(findDominant(arr)); // Output: 3
}
    public static int findDominant(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int threshold = array.length / 2;
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }

}
