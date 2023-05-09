package ss2.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ hình tam giác vuông với góc vuông phía dưới bên trái ");
        System.out.println("3. Vẽ hình tam giác vuông với góc vuông phía dưới bên phải");
        System.out.println("4. Vẽ hình tam giác vuông với góc vuông phía trên bên trái");
        System.out.println("5. Vẽ hình tam giác vuông với góc vuông phía trên bên phải");
        System.out.println("6. Thoát");
        num = scanner.nextInt();

        switch (num) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println(' ');
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i >= j) {
                            System.out.print('*');
                        }
                    }
                    System.out.println(' ');
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j >= 5 - 1 - i) {
                            System.out.print('*');
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i <= j) {
                            System.out.print('*');
                        }
                    }
                    System.out.println(' ');
                }
                break;
            case 5:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j >= i) {
                            System.out.print('*');
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 6:
                System.out.println("Bạn đã thoát chương trình");
        }
    }
}
