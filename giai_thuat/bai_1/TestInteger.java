package giai_thuat.bai_1;

import java.util.*;

public class TestInteger {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 4, 2, 3, 1};
        System.out.println(arr.length);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    map.put(arr[i], count);
                }
            }
        }

        Set<Integer> setKey = map.keySet();
        int temp = map.get(arr[0]);
        boolean flag = true;
        for (Integer key : setKey) {
            if (temp != map.get(key)) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
