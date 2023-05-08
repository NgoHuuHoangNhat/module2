package ss1.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        float a, b, x;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        a = scanner.nextFloat();

        System.out.println("Nhập số b: ");
        b = scanner.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x = -b/a;
            System.out.println("Phương trình có nghiệm là: " + x);
        }
    }
}


//ax+b=0