package algorithms.bai_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckStr {

    public static List<String> checkStr(String firstStr, String secondStr) {
        List<String> stringList = new ArrayList<>();

        String[] firstArr = firstStr.split("");
        String[] secondArr = secondStr.split("");

        List<String> strings = new ArrayList<>();
        stringList.addAll(Arrays.asList(secondArr));

        for (String str : firstArr) {
            if (stringList.contains(str)) {
                strings.add(str);
                stringList.remove(str);
            }
        }

        return strings;
    }
}
