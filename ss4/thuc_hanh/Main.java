package ss4.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập chiều dài hình chữ nhật: ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("nhập chiều rộng hình chữ nhật: ");
        double width = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("hình chữ nhật có " + rectangle.getIfo());
        System.out.println("hình chữ nhật có chu vi là: " + rectangle.getRetanglePerimeter());
        System.out.println("hình chữ nhật có diện tích là: " + rectangle.getRetangleArea());
    }
}
