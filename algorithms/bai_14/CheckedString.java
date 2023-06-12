package algorithms.bai_14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CheckedString {

    public static int getDifferentNumberOfCharacter(String str) {
        if(str.length() == 0){
            return 0;
        }
        Set<String> set = new HashSet<>();
        String[] arr = str.split("");
        set.addAll(Arrays.asList(arr));
        System.out.println(set);
        return set.size();
    }
}
