package ss12.bai_3;

import java.util.LinkedList;

public class LongestString {
    public String findLongestString(String str) {
        String newStr = "";

        LinkedList<Character> longestList = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            list.clear();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (list.getLast() < str.charAt(j)) {
                    list.add(str.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > longestList.size()) {
                longestList.clear();
                longestList.addAll(list);
            }
        }

        for (Character character : longestList) {
            newStr += character;
        }

        return newStr;
    }
}
