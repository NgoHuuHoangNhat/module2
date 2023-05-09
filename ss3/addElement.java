package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] arrNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

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
            arrNum[i] = arrNum[i-1];
        }

        arrNum[count] = num;
        System.out.println(Arrays.toString(arrNum));
    }

}
