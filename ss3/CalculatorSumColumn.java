package ss3;

import java.util.Scanner;

public class CalculatorSumColumn {
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

        for (int i = 0; i < arrLength; i++) {
            String str = "";
            for (int j = 0; j < arrLength; j++) {
                str += arrFloat[i][j] + ", ";
            }
            System.out.println("dòng " + i + " là: " + str);
        }

        System.out.println("Nhập cột cần tính tổng");
        int colum = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if(colum == j){
                    sum += arrFloat[i][j];
                }
            }
        }

        System.out.println("Tổng các số trong cột "+ colum +" là: "+sum);
    }
}
