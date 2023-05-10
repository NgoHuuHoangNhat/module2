package ss3;

import java.util.Scanner;

public class CalculatorSumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        double[][] arrFloat = new double[arrLength][arrLength];

        addArr(arrFloat);

        System.out.println("Nhập cột cần tính tổng");
        int colum = Integer.parseInt(scanner.nextLine());

        System.out.println("Tổng các số trong cột " + colum + " là: " + calculatorSum(arrFloat, colum));
    }

    public static void addArr(double[][] arrFloat) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat.length; j++) {
                System.out.print("nhập phần tử thứ " + j + " trong mảng " + i + ": ");
                arrFloat[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        for (int i = 0; i < arrFloat.length; i++) {
            String str = "";
            for (int j = 0; j < arrFloat.length; j++) {
                str += arrFloat[i][j] + ", ";
            }
            System.out.println("dòng " + i + " là: " + str);
        }
    }

    public static double calculatorSum(double[][] arrFloat, int colum) {
        double sum = 0;
        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat.length; j++) {
                if (colum == j) {
                    sum += arrFloat[i][j];
                }
            }
        }
        return sum;
    }

}
