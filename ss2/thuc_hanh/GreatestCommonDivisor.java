package ss2.thuc_hanh;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int numA, numB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số A");
        numA = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số B");
        numB = Integer.parseInt(scanner.nextLine());



        for (int i = numA; i > 0; i--) {
            if (numA % i == 0 && numB % i == 0) {
                System.out.println("Ước chung lớn nhất của A và B là: " + i);
                break;
            }
        }
    }
}
