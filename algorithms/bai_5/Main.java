package algorithms.bai_5;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, 150, -1, 170, -1, -1, 160, 180};
        System.out.println("array after sort:  " + Arrays.toString(arr));
        int[] newArr = ArraySort.sort(arr);


        System.out.println("array before sort:  " + Arrays.toString(newArr));

    }
}
