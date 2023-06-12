package algorithms.bai_16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,0};
        int length = arrA.length;
        int[] arrB = new int[length];

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum+= arrA[i];
            arrB[i] = sum;
        }
        System.out.println(Arrays.toString(arrB));
    }
}
