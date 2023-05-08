package ss1.bai_tap;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên");
        name = scanner.nextLine();

        System.out.println("Hello " + name);
    }

}



