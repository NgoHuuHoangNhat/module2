package ss3;

import java.util.Scanner;

public class SumElementInMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        double[][] arrFloat = new double[arrLength][arrLength];

        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                System.out.print("nhập phần tử thứ " + j + " trong mảng " + i + ": ");
                arrFloat[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        displayArrFloat(arrFloat);

        double sum = calculatorSum(arrFloat);
        System.out.println("Tổng của đường chéo chính là: " + sum);

    }

    public static void displayArrFloat(double[][] arrFloat) {
        for (int i = 0; i < arrFloat.length; i++) {
            String str = "";
            for (int j = 0; j < arrFloat.length; j++) {
                str += arrFloat[i][j] + ", ";
            }
            System.out.println("dòng " + i + " là: " + str);
        }
    }

    public static double calculatorSum(double[][] arrFloat) {
        double sum = 0;

        for (int i = 0; i < arrFloat.length; i++) {
            sum += arrFloat[i][i];
        }
        return sum;
    }
}
