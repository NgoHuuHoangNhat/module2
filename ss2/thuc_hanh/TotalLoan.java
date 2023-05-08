package ss2.thuc_hanh;

import java.util.Scanner;

public class TotalLoan {
    public static void main(String[] args) {
        long loan, month;
        double rate, totalLoan;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền vay");
        loan = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập số tháng vay");
        month = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập lãi suất");
        rate = Float.parseFloat(scanner.nextLine());

        totalLoan = loan * Math.pow((1 + rate / 100), month);

        System.out.println("Tổng tiền phải trả là: " + totalLoan);
    }
}
