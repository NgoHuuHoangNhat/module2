package algorithms.bai_7;

import java.util.*;

public class CheckPrime {

    public static Set<Integer> enterArrPrime(int[][] arr) {
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (checkPrime(arr[i][j]) && !list.contains(arr[i][j])) {
                    list.add(arr[i][j]);
                }
            }
        }

        return list;
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
