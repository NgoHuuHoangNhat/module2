package s11.tree_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapStr {
    public void treeMap(String str) {

        String LowerCaseStr = str.toLowerCase();

        String[] arr = LowerCaseStr.split("\\s+");

        Map<String, Integer> treeMap = new LinkedHashMap<>();

        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            treeMap.put(arr[i], count);
        }


        Set<String> keyMap = treeMap.keySet();

        for (String key : keyMap) {
            System.out.println("key: " + key + ", count: " + treeMap.get(key));
        }

    }
}
