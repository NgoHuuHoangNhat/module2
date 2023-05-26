import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class demo {
    public static void main(String[] args) {
        String[] strs = {"cardog", "carracecars", "carc"};
//        String[] strs = {"flower", "flowaer", "flighter"};

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String strFirst = strs[0];
        String strLast = strs[strs.length - 1];
        int index = 0;
        String str = "";

        while (index < strFirst.length() && index < strLast.length()) {
            if(strFirst.charAt(index) == strLast.charAt(index)){
                str+=strFirst.charAt(index);
            }else {
                break;
            }
           index++;
        }
        return str;


    }
}