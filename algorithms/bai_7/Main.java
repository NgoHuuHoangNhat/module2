package algorithms.bai_7;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 8, 43},
//                {9, 4, 11, 7},
//                {11, 6, 4, 0},
//                {1, 2, 6, 51}};
        int[][] arr = {
                {1, 2, 8, 43},
                {9, 49, 11, 7},
                {11, 6, 4, 0},
                {1, 2, 6, 51}};
        Set<Integer> arrNew = CheckPrime.enterArrPrime(arr);
        System.out.println(arrNew);
    }
}
