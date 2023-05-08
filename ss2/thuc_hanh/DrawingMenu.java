package ss2.thuc_hanh;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình tam giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        System.out.println("4. Thoát");
        num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("Xin cảm ơn");
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i == 0 || i <= j) {
                            System.out.print('*');
                        }
                    }
                    System.out.println(' ');
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println(' ');
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println(' ');
                }
                break;
        }
    }
}
