package algorithms.bai_19;

import java.util.Map;
import java.util.TreeMap;

public class CheckInt {
    public static boolean checkArr(int[] arr) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i:arr) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int temp = map.get(arr[0]);
        for (Integer i : map.keySet()) {
            if(temp != map.get(i)){
                return false;
            }
        }return true;
    }
}
