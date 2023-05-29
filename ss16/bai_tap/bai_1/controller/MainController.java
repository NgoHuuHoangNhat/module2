package ss16.bai_tap.bai_1.controller;

import ss16.bai_tap.bai_1.service.IProductService;
import ss16.bai_tap.bai_1.service.ProductService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService productService = new ProductService();

    public static void menu() {
        while (true) {
            System.out.print("Chọn chức năng\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "0. Thoát chương trình\n" +
                    "Chọn: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("**************************************");
                System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
                System.out.println("**************************************");
                menu();
            }
            switch (choice) {
                case 0:
                    System.exit(1);
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.search();
                    break;
                default:
                    System.out.println("*****************************************");
                    System.out.println("Không có chức năng này, vui lòng nhập lại");
                    System.out.println("*****************************************");
            }
        }
    }
}
