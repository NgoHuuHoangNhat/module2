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

        System.out.println("nhập 1 số");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập vị trí");
        int index = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (i == index) {
                count = i;
                break;
            }
        }

        for (int i = arrNum.length - 1; i > count; i--) {
            arrNum[i] = arrNum[i - 1];
        }
        arrNum[count] = num;
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
            } else {
                arrNum[i] = 0;
            }
        }
        return arrNum;
    }
}
