package algorithms.bai_20;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = { "abc","" ,"a"};
        String[] newArr = ArrSort.sort(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
