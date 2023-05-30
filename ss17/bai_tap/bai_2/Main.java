package ss17.bai_tap.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập 1 số điện thoại: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Số điện thoại nhập vào " + (ValidatePhoneNumber.checkPhoneNumber(phoneNumber) ?
                    "đúng định dạng!" : "không đúng định dạng"));
        }
    }
}
