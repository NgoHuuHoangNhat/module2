package ss6.bai_tap.bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 10, 20);
        System.out.println(movablePoint);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("nhập 0 để di chuyển.");
            int chose = Integer.parseInt(scanner.nextLine());

            if (chose == 0) {
                movablePoint.move();
                System.out.println(movablePoint);
            }
        }
    }
}
