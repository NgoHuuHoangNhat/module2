package ss10.bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Binary binary = new Binary();

        System.out.print("nhập 1 số tự nhiên: ");
        int decimal = Integer.parseInt(scanner.nextLine());

        if (decimal > 0) {
            System.out.println("số nhập vào là: " + decimal);
            System.out.println("sau khi chuyển qua hệ nhị phân là: " + binary.switchToBinary(decimal));

        }else {
            System.out.println("nhập sai");
        }
    }
}
