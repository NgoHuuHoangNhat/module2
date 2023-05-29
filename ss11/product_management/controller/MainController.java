package ss11.product_management.controller;

import ss11.product_management.service.IProductService;
import ss11.product_management.service.product_service.ProductService;

import java.util.Scanner;

public class MainController {
    private static IProductService productService = (IProductService) new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.print("-Nhập để chọn chức năng-\n" +
                    "1. Hiển thị danh sách sản phẩm\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Xoá sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm\n" +
                    "5. Sửa thông tin sản phẩm\n" +
                    "6. Sắp xếp sản phẩm theo giá\n" +
                    "0. Thoát chương trình\n" +
                    "Chọn chức năng: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());

            }catch (NumberFormatException numberFormatException){
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
                    productService.remove();
                    break;
                case 4:
                    productService.searchProduct();
                    break;
                case 5:
                    productService.editProduct();
                    break;
                case 6:
                    productService.sortByPrice();
                    break;
                default:
                    System.out.println("******************************************");
                    System.out.println("Không có chức năng này, vui lòng nhập lại!");
                    System.out.println("******************************************");

            }

        }
    }
}
