package product.controller;

import product.service.IProductService;
import product.service.imp.ProductService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService productService = (IProductService) new ProductService();

    public static void menu() {
        DO_WHILE:do {
            System.out.print("Nhập lựa chọn của bạn: \n" +
                    "1. Hiển thị sản phầm\n" +
                    "2. Thêm mới sản phầm \n" +
                    "3. Xoá sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm\n" +
                    "5. Sửa thông tin sản phầm\n" +
                    "6. Thoát chương trình\n" +
                    "Option: ");

            String option = scanner.nextLine();
            switch (option) {
                case "1":productService.display();
                    break ;
                case "2":productService.add();
                    break ;
                case "3":productService.remove();
                    break ;
                case "4":productService.search();
                    break ;
                case "5":productService.edit();
                    break ;
                case "6":
                    System.exit(1);
                default:
                    System.out.println("Không có lựa chọn này, yêu cầu nhập lại!");
            }
        }while (true);
    }
}
