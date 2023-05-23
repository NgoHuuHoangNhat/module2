package ss12.bai_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxStringAscending {
    public String findMaxString(String str){
        if(!str.equals("")){
            LinkedList<Character> longestStrList = new LinkedList<>();
            LinkedList<Character> strList = new LinkedList<>();
            String longestStr = "";

            for (int i = 0; i < str.length(); i++) {
                strList.clear();
                strList.add(str.charAt(i));

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) > strList.getLast()) {
                        strList.add(str.charAt(j));
                    }
                }

                if (strList.size() > longestStrList.size()) {
                    longestStrList.clear();
                    longestStrList.addAll(strList);
                }
            }

            for (Character character : longestStrList) {
                longestStr += character;
            }
            return longestStr;

        }
        return null;
    }

}
