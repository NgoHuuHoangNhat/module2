package ss3;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        System.out.print("nhập độ dài của mỗi mảng con trong mảng: ");
        int elementLength = Integer.parseInt(scanner.nextLine());

        double[][] arrFloat = new double[arrLength][elementLength];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("nhập phần tử thứ " + (j + 1) + " trong mảng " + (i + 1) + ": ");
                arrFloat[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        String str = "";

        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < elementLength; j++) {
                str += arrFloat[i][j] + ", ";
            }
        }

        System.out.println("mảng vừa nhập là: " + str);

        double min = arrFloat[0][0];

        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 0; j < arrFloat[i].length; j++) {
                if (min > arrFloat[i][j]) {
                    min = arrFloat[i][j];
                }

            }
        }
        System.out.println("số nhỏ nhất trong mảng 2 chiều là " + min);
    }
}
