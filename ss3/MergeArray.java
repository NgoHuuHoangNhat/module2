package ss3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số lượng phần tử của mảng 1");
        int numFirst = Integer.parseInt(scanner.nextLine());
        int[] arrFirst = new int[numFirst];
        System.out.println("nhập phần tử vào mảng thứ nhất");
        for (int i = 0; i < arrFirst.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + ": ");
            arrFirst[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập số lượng phần tử của mảng 2");
        int numSecond = Integer.parseInt(scanner.nextLine());
        int[] arrSecond = new int[numSecond];
        System.out.println("nhập phần tử vào mảng thứ hai");
        for (int i = 0; i < arrSecond.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + ": ");
            arrSecond[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] arrThird = mergeArr(arrFirst,arrSecond);
        System.out.println(Arrays.toString(arrThird));
    }

    public static int[] mergeArr(int[] arrFirst, int[] arrSecond) {
        int[] arrThird = new int[arrFirst.length + arrSecond.length];

        for (int i = 0; i < arrThird.length; i++) {
            if (i < arrFirst.length) {
                arrThird[i] = arrFirst[i];
            } else {
                arrThird[i] = arrSecond[i - arrFirst.length];
            }
        }
        return arrThird;
    }

}
