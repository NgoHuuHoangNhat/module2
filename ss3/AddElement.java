package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arrNum = createArr();

        addElement(arrNum);

        System.out.println(Arrays.toString(arrNum));
    }


    public static void addElement(int[] arrNum) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập số lượng số cần thêm vào mảng (là số nguyên dương bé hơn hoặc bằng 5): ");
        int count = Integer.parseInt(scanner.nextLine());

        if (count > 0 && count <= 5) {
            for (int i = 0; i < count; i++) {

                System.out.print("nhập số: ");
                int num = Integer.parseInt(scanner.nextLine());

                System.out.print("nhập vị trí: ");
                int index = Integer.parseInt(scanner.nextLine());

                for (int j = 0; j < arrNum.length; j++) {
                    if (j == index) {
                        for (int e = arrNum.length - 1; e > j; e--) {
                            arrNum[e] = arrNum[e - 1];
                        }
                        arrNum[index] = num;
                    }
                }
            }
        } else {
            System.out.println("nhập sai");
        }

    }

    public static int[] createArr() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số lượng số nguyên bạn muốn nhập");
        int length = Integer.parseInt(scanner.nextLine());

        int[] arrNum = new int[length + 5];

        for (int i = 0; i < length + 5; i++) {
            if (i < length) {
                System.out.print("nhập số nguyên thứ " + i + " vào mảng: ");
                arrNum[i] = Integer.parseInt(scanner.nextLine());
            }
        }
        return arrNum;
    }
}
