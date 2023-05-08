package ss1.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập năm: ");
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + " là năm Nhuận");
        } else {
            System.out.println(year + " k phải năm nhuận");
        }
    }
}
