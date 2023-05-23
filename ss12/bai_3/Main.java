package ss12.bai_3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập vào 1 chuỗi: ");

        String str = scanner.nextLine();

        LongestString longestString = new LongestString();

        System.out.println("Chuỗi liên kết có độ dài lớn nhất trong chuỗi là: "+ longestString.findLongestString(str));




    }
}
