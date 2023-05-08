package ss2.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        long num;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLong();

        if (num < 2) {
            flag = false;
        } else {
            for (long i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không phải là số nguyên tố");
        }

    }
}