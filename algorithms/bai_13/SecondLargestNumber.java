package algorithms.bai_13;

import java.util.ArrayDeque;

public class SecondLargestNumber {

    public static int getIndex(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int secondLargestNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max){
                secondLargestNumber = arr[i];
                break;
            }
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == max) {
                continue;
            }
            if (arr[i] >= secondLargestNumber) {
                secondLargestNumber = arr[i];
                queue.add(i);
            }
        }
        if (queue.size() == 0) {
            return -1;
        }
        return queue.getLast();
    }
}
