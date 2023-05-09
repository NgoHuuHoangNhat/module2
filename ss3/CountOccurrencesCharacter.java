package ss3;

import java.util.Scanner;

public class CountOccurrencesCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một chuỗi");
        String str = scanner.nextLine();

        System.out.println("Nhập kí tự cần kiểm tra");
        char ch = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Chuỗi nhập vào là: " + str);
        System.out.println("Kí tự " + ch + " xuất hiện " + count + " lần!");
    }
}
