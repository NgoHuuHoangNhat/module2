package algorithms.bai_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CheckStr {
    public static boolean checkStr(String firstStr, String secondStr) {
        int length = firstStr.length();
        if (length != secondStr.length()) {
            return false;
        }
        TreeMap<Character, Integer> characterMapFirstStr = new TreeMap<>();
        TreeMap<Character, Integer> characterMapSecondStr = new TreeMap<>();

        for (int i = 0; i < length; i++) {
            char charAtFirstStr = firstStr.charAt(i);
            if (!characterMapFirstStr.containsKey(charAtFirstStr)) {
                characterMapFirstStr.put(charAtFirstStr, 1);
            } else {
                characterMapFirstStr.put(charAtFirstStr, characterMapFirstStr.get(charAtFirstStr) + 1);
            }

            char charAtSecondStr = secondStr.charAt(i);
            if (!characterMapSecondStr.containsKey(charAtSecondStr)) {
                characterMapSecondStr.put(charAtSecondStr, 1);
            } else {
                characterMapSecondStr.put(charAtSecondStr, characterMapSecondStr.get(charAtSecondStr) + 1);
            }
        }

        if(characterMapFirstStr.size() != characterMapSecondStr.size()||characterMapFirstStr.equals(characterMapSecondStr.hashCode()) ){
            return false;
        }
        
        return true;
    }
}
