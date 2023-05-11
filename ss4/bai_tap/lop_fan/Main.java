package ss4.bai_tap.lop_fan;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fan fanYellow = new Fan(10, "yellow");
        Fan fanBlue = new Fan(5, "Blue");

        System.out.println("Chọn quạt: \n 0. Quạt màu vàng \n 1. Quạt màu xanh dương ");
        int choseFan = Integer.parseInt(scanner.nextLine());

        Fan[] arr = {fanYellow, fanBlue};

        System.out.println("Chọn bật/tắt quạt: \n 0. Bật \n 1. Tắt ");
        int choseOnOff = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            if (choseFan == i) {
                if (choseOnOff == 0) {
                    System.out.println(arr[i].getOn());
                    System.out.println("Chọn tốc độ quạt: \n 1. Slow \n 2. Medium \n 3. Fast");
                    int choseSpeed = Integer.parseInt(scanner.nextLine());
                    arr[i].setSpeed(choseSpeed);
                    System.out.println(arr[i].getOn());
                } else if (choseOnOff == 1) {
                    System.out.println(arr[i].getOff());
                }
            }
        }


    }
}
