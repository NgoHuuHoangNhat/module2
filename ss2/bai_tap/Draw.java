package ss2.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ hình tam giác vuông với góc vuông phía dưới bên trái ");
        System.out.println("3. Vẽ hình tam giác vuông với góc vuông phía dưới bên phải");
        System.out.println("4. Vẽ hình tam giác vuông với góc vuông phía trên bên trái");
        System.out.println("5. Vẽ hình tam giác vuông với góc vuông phía trên bên phải");
        System.out.println("6. Vẽ hình tam giác cân");
        System.out.println("7. Thoát");
        int chose = Integer.parseInt(scanner.nextLine());

        if (chose == 7) {
            System.out.println("Bạn đã thoát chương trình");
        } else {

            System.out.print("Nhập độ dài: ");
            int length = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:

                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println(' ');
                    }
                    break;
                case 2:
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (i >= j) {
                                System.out.print('*');
                            }
                        }
                        System.out.println(' ');
                    }
                    break;
                case 3:
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j >= length - 1 - i) {
                                System.out.print('*');
                            } else {
                                System.out.print(' ');
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (i <= j) {
                                System.out.print('*');
                            }
                        }
                        System.out.println(' ');
                    }
                    break;
                case 5:
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
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
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length * 2 - 1; j++) {
                            if (j >= length - 1 - i && j <= length - 1 + i) {
                                System.out.print('*');
                            } else {
                                System.out.print(' ');
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 7:

            }
        }
    }
}
