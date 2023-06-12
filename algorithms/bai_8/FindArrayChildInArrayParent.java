package algorithms.bai_8;

import java.util.*;

public class FindArrayChildInArrayParent {
    public static int findNum(int[] parent, int[] child) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer c : child) {
            map.put(c, 0);
        }
        for (Integer p : parent) {
            if (map.containsKey(p))
                map.put(p, map.get(p) + 1);
        }
        int min = map.get(child[0]);
        for (Integer key : map.keySet()) {
            if (min > map.get(key))
                min = map.get(key);
        }


        return min;
    }
}
