package algorithms.bai_6;

import java.util.*;

public class FindChar {

    public static List<String> findChar(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = str.split("");
        for (String key :arr) {
            if(!map.containsKey(key)){
                map.put(key, 1);
            }else {
                map.put(key, map.get(key)+1);
            }
        }
        List<String> stringList = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if(map.get(key) !=1){
                stringList.add(key);
            }
        }

        return stringList;
        }
}
