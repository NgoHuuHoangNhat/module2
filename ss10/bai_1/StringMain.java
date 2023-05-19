package ss10.bai_1;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Reverse reverse = new Reverse();

        System.out.print("nhập 1 chuỗi: ");
        String str = scanner.nextLine();

        System.out.println("chuỗi sau khi đảo ngược là: " + reverse.reverseString(str));

    }
}
