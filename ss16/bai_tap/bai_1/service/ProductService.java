package ss16.bai_tap.bai_1.service;

import ss16.bai_tap.bai_1.model.Product;
import ss16.bai_tap.bai_1.repository.IProductRepository;
import ss16.bai_tap.bai_1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> productList = productRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        while (true) {
            System.out.print("Nhập mã sản phẩm: ");
            String checkId = scanner.nextLine();

            Product product = productRepository.getProductByID(checkId);
            if (product != null) {
                System.out.println("***************************************************************************");
                System.out.println("Sản phẩm " + product.getName() + " đã có trong danh sách, vui lòng nhập lại mã!");
                System.out.println("***************************************************************************");
            } else {
                System.out.print("Nhập tên sản phẩm: ");
                String newName = scanner.nextLine();
                float newPrice = 0;
                while (true) {
                    System.out.print("Nhập giá sản phẩm: ");

                    try {
                        newPrice = Float.parseFloat(scanner.nextLine());
                        break;
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("**************************************");
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
                        System.out.println("**************************************");
                    }
                }

                System.out.print("Nhập hãng sản xuất: ");
                String newManufacturer = scanner.nextLine();

                System.out.println("Nhập mô tả sản phẩm: ");
                String newDetail = scanner.nextLine();

                productRepository.addProduct(checkId, newName, newPrice, newManufacturer, newDetail);
                System.out.println("Thêm sản phẩm thành công!");
                System.out.println("-------------------------");
                break;
            }

        }
    }

    @Override
    public void search() {
        while (true) {
            System.out.print("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
            String checkName = scanner.nextLine();

            List<Product> productList = productRepository.getProductByName(checkName);

            if (productList == null) {
                System.out.println("*******************************************************");
                System.out.println("Không có sản phẩm nào phù hợp với từ khoá: " + checkName);
                System.out.println("*******************************************************");

            } else {
                System.out.println("Các sản phẩm phù hợp với từ khoá: " + checkName);
                for (Product product : productList) {
                    System.out.println(product);
                }
                break;
            }
        }
    }
}
