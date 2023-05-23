package ss12.bai_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();

        MaxStringAscending maxStringAscending = new MaxStringAscending();

        System.out.println("Chuỗi tăng dần lớn nhất là: " + maxStringAscending.findMaxString(str));

    }
}
