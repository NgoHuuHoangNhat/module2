package algorithms.bai_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr {

    public static List<Integer> find(int[] arr) {
        List<Integer> list = new ArrayList<>();

        if(arr.length == 0){
            return list;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        for (int i = min + 1; i < max; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    flag = false;
                }
            }
            if (flag == true && !list.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
