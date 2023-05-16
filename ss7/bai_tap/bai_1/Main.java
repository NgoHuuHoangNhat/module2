package ss7.bai_tap.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Circle circle = new Circle("red", true, 5);
        Retangle retangle = new Retangle(3, 5);
        Square square = new Square(5);

        System.out.print("nhập tỉ lệ: ");
        int rate = Integer.parseInt(scanner.nextLine());

        if (rate > 0 && rate <= 100) {
            System.out.print("diện tích cũ của hình tròn là: ");
            System.out.println(circle.getArea());
            System.out.print("diện tích hình tròn sau khi thay đổi: ");
            circle.resize(rate);

            System.out.print("diện tích củ của hình chữ nhật là: ");
            System.out.println(retangle.getArea());
            System.out.print("diện tích hình chữ nhật sau khi thay đổi: ");
            retangle.resize(rate);

            System.out.print("diện tích cũ của hình vuông là: ");
            System.out.println(square.getArea());
            System.out.print("diện tích của hình vuông sau khi thay đổi: ");
            square.resize(rate);
        }
    }
}
