package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        System.out.print("nhập độ dài của mỗi mảng con trong mảng: ");
        int elementLength = Integer.parseInt(scanner.nextLine());

        double[][] arrFloat = new double[arrLength][elementLength];

        addArr(arrFloat);

        System.out.println("số lớn nhất trong mảng 2 chiều là " + findMax(arrFloat));
    }

    public static void addArr(double[][] arrFloat) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat[i].length; j++) {
                System.out.print("nhập phần tử thứ " + (j + 1) + " trong mảng " + (i + 1) + ": ");
                arrFloat[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        String str = "";

        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat[i].length; j++) {
                str += arrFloat[i][j] + ", ";
            }
        }

        System.out.println("mảng vừa nhập là: " + str);
    }

    public static double findMax(double[][] arrFloat) {
        double max = arrFloat[0][0];

        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat[i].length; j++) {
                if (max < arrFloat[i][j]) {
                    max = arrFloat[i][j];
                }
            }
        }
        return max;
    }
}

