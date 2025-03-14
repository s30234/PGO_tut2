package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(filterEvenIndexOddValue(arr)));
    }
    public static int [] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0 && i % 2 == 0) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

}
