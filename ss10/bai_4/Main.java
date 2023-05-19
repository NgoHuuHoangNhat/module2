package ss10.bai_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Palindrome palindrome = new Palindrome();

        while (true) {
            System.out.print("nhập 1 chuỗi: ");

            String str = scanner.nextLine();

            System.out.println("chuỗi nhập vào " + (palindrome.testStr(str) ? "là palindrome" : "không phải là palindrome"));
        }

    }


}
