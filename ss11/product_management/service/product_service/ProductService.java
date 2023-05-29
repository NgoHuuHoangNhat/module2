package ss11.product_management.service.product_service;


import ss11.product_management.controller.MainController;
import ss11.product_management.model.product.Product;
import ss11.product_management.repository.IProductRepository;
import ss11.product_management.repository.product_repository.ProductRepository;
import ss11.product_management.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {

        List<Product> productList = (List<Product>) productRepository.getAll();
        if (productList.size() > 0) {
            for (Product product : productList) {
                System.out.println(product);
            }
        }else {
            System.out.println("*********************");
            System.out.println("Danh sách đang trống!");
            System.out.println("*********************");

        }

    }

    @Override
    public void add() {
        System.out.print("Nhập mã sản phẩm: ");
        String checkId = scanner.nextLine();

        Product checkProduct = productRepository.getById(checkId);

        if (checkProduct != null) {
            System.out.println("sản phẩm đã có trong cửa hàng");
        } else {
            System.out.print("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();

            System.out.print("Nhập giá sản phẩm: ");
            float price = Float.parseFloat(scanner.nextLine());

            System.out.print("Nhập số lượng sản phẩm: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập thông tin sản phẩm: ");
            String details = scanner.nextLine();

            Product newProduct = new Product(checkId, name, price, quantity, details);
            productRepository.add(newProduct);

            System.out.println("Thêm sản phẩm thành công!");

        }

    }

    @Override
    public void remove() {
        System.out.print("Nhập mã sản phẩm bạn muốn xoá: ");
        String checkId = scanner.nextLine();

        Product product = productRepository.getById(checkId);

        if (product == null) {
            System.out.println("Không có sản phẩm trên!");
        } else {
            System.out.println("Bạn có muốn xoá sản phẩm " + product.getName() + " với id là: " + checkId);
            System.out.println("1. Yes\n" +
                    "2. No\n" +
                    " Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                productRepository.remove(product);
            }
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String name = scanner.nextLine();

        List<Product> productList = productRepository.getByName(name);
        if (productList == null) {
            System.out.println("Không có sản phẩm có tên: " + name);
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void editProduct() {
        System.out.print("Nhập id của sản phẩm cần sửa: ");
        String checkId = scanner.nextLine();

        Product product = productRepository.getById(checkId);

        if (product == null) {
            System.out.println("Không có sản phẩm với id: " + checkId);
        } else {
            System.out.println("Bạn có muốn sửa sản phẩm: " + product.getName() + " với id là: " + checkId);
            System.out.print("1. Yes\n" +
                    "2. No\n" +
                    "Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Nhập tên mới cho sản phẩm: ");
                String newName = scanner.nextLine();

                System.out.print("Nhập giá mới cho sản phẩm:  ");
                float newPrice = Float.parseFloat(scanner.nextLine());

                System.out.println("Nhập số lượng mới cho sản phẩm: ");
                int newQuantity = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập thông tin mới cho sản phẩm: ");
                String newDetails = scanner.nextLine();

                productRepository.setProduct(product, newName, newPrice, newQuantity, newDetails);

                System.out.println("Bạn đã thay đổi sản phẩm!!!");
            }


        }
    }

    @Override
    public void sortByPrice() {
        System.out.println("Bạn muốn sắp xếp theo kiểu: ");
        System.out.println("1. Tăng dần\n" +
                "2. Giảm dần\n" +
                "Chọn: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                productRepository.sortUp();
                break;
            case 2:
                productRepository.sortDown();
                break;
            default:
                System.out.println("Nhập sai!!!");
        }


    }

}
