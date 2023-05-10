//package ss3;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class DeleteElement {
//    public static void main(String[] args) {
//        int[] arrNum = enterArr();
//
//        System.out.println(Arrays.toString(arrNum));
//
//        deleteElement(arrNum);
//
//        System.out.println(Arrays.toString(arrNum));
//    }
//
//    public static int[] enterArr() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("nhập số phần tử của mảng: ");
//        int length = Integer.parseInt(scanner.nextLine());
//
//        int[] arrNum = new int[length];
//
//        for (int i = 0; i < arrNum.length; i++) {
//            System.out.println("nhập số nguyên thứ " + i);
//            arrNum[i] = Integer.parseInt(scanner.nextLine());
//        }
//        return arrNum;
//    }
//
//    public static void deleteElement(int[] arrNum) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("nhập 1 số");
//        int num = Integer.parseInt(scanner.nextLine());
//        int count = 0;
//
//        for (int i = 0; i < arrNum.length; i++) {
//            if (num == arrNum[i]) {
//                count = i;
//                break;
//            }
//        }
//        for (int i = count; i < arrNum.length - 1; i++) {
//            arrNum[i] = arrNum[i + 1];
//        }
//        arrNum[arrNum.length - 1] = 0;
//
//    }
//}


package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arrNum = enterArr();

        System.out.println(Arrays.toString(arrNum));

        deleteElement(arrNum);

        System.out.println(Arrays.toString(arrNum));
    }

    public static int[] enterArr() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập số phần tử của mảng: ");
        int length = Integer.parseInt(scanner.nextLine());

        int[] arrNum = new int[length];

        for (int i = 0; i < arrNum.length; i++) {
            System.out.print("nhập số nguyên thứ " + i + ": ");
            arrNum[i] = Integer.parseInt(scanner.nextLine());
        }
        return arrNum;
    }

    public static void deleteElement(int[] arrNum) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập 1 số");

        int num = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < arrNum.length; j++) {

            int count = 0;

            for (int i = 0; i < arrNum.length; i++) {
                if (num == arrNum[i]) {
                    count = i;
                    break;
                }
            }
            for (int i = count; i < arrNum.length - 1; i++) {
                arrNum[i] = arrNum[i + 1];
            }
            arrNum[arrNum.length - 1] = 0;

        }
    }
}