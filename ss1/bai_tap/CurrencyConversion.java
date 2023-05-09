package ss1.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tỉ giá hiện tại");
        float rate = scanner.nextFloat();

        System.out.println("Nhập số tiền cần chuyển đổi (USD)");
        float usd = scanner.nextFloat();

        float vnd = usd * rate;

        System.out.println("Giá trị khi chuyển sang VND: " + vnd);

    }
}
