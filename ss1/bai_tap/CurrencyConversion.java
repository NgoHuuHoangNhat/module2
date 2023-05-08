package ss1.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        float vnd, usd, rate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tỉ giá hiện tại");
        rate = scanner.nextFloat();

        System.out.println("Nhập số tiền cần chuyển đổi (USD)");
        usd = scanner.nextFloat();

        vnd = usd * rate;

        System.out.println("Giá trị khi chuyển sang VND: " + vnd);

    }
}
