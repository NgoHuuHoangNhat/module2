package ss2.bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        int num = 2;
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số lượng số nguyên tố");
        int size = scanner.nextInt();
        boolean flag;
        while (i < size) {
            flag = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(num + ", ");
                i++;
            }
            num++;
        }
    }
}
