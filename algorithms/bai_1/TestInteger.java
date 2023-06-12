package algorithms.bai_1;

import java.util.*;

public class TestInteger {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 4, 2, 3, 1};
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
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
