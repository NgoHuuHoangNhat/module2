package ss17.bai_tap.bai_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập tên lớp: ");
            String classesName = scanner.nextLine();

            System.out.println("Tên bạn nhập vào " + (ValidateClassesName.checkClassesName(classesName) ? "đúng là tên lớp!" : "không phải là tên lớp"));
        }
    }
}
