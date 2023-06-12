package product.service.imp;

import product.model.Product;
import product.repository.IProductRepository;
import product.repository.imp.ProductRepository;
import product.service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = (IProductRepository) new ProductRepository();

    @Override
    public void display() {
        List<Product> productList = productRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        do {
            System.out.print("Nhập id sản phẩm: ");
            String id = scanner.nextLine();
            if (!id.matches("^P-\\d{3}$")) {
                System.out.println("Nhập sai, nhập lại!");
            } else {
                Product product = productRepository.getById(id);
                if (product != null) {
                    System.out.println("Sản phẩm này đã có trong cửa hàng!");
                } else {
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    double price = 0d;
                    do {
                        try {
                            System.out.print("Nhập giá của sản phẩm: ");
                            price = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập sai định dạng");
                        }
                    } while (true);

                    int quantity = 0;
                    do {
                        try {
                            System.out.print("Nhập số lượng sản phẩm: ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập sai định dạng");
                        }
                    } while (true);

                    System.out.print("Nhập thông tin: ");
                    String info = scanner.nextLine();

                    String str = id + "," + name + "," + price + "," + quantity + "," + info;
                    productRepository.addProduct(str);
                    System.out.println("Sản phẩm đã được thêm vào!");
                    break;
                }
            }
        } while (true);
    }

    @Override
    public void remove() {
        do {
            System.out.print("Nhập id sản phẩm: ");
            String id = scanner.nextLine();
            if (!id.matches("^P-\\d{3}$")) {
                System.out.println("Nhập sai, nhập lại!");
            } else {
                Product product = productRepository.getById(id);
                if (product == null) {
                    System.out.println("Sản phẩm này không có trong cửa hàng!");
                } else {
                    System.out.print("Bạn có muốn xoá sản phẩm " + product.getName() + "\n" +
                            "nhập yes để xoá: ");
                    String option = scanner.nextLine();
                    if (!option.toLowerCase().equals("yes")) {
                        System.out.println("Sản phẩm không được xoá");
                        return;
                    }
                    productRepository.remove(product);
                    System.out.println("Sản phẩm đã được xoá!");
                    break;
                }


            }
        } while (true);
    }

    @Override
    public void search() {

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        List<Product> productList = productRepository.getByName(name);
        if (productList == null) {
            System.out.println("Không có sản phẩm nào có tên gần giống: " + name);
        }
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void edit() {
        do {
            System.out.print("Nhập id sản phẩm: ");
            String id = scanner.nextLine();
            if (!id.matches("^P-\\d{3}$")) {
                System.out.println("Nhập sai, nhập lại!");
            } else {
                Product product = productRepository.getById(id);
                if (product == null) {
                    System.out.println("Sản phẩm này không có trong cửa hàng!");
                } else {
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    double price = 0d;
                    do {
                        try {
                            System.out.print("Nhập giá của sản phẩm: ");
                            price = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập sai định dạng");
                        }
                    } while (true);

                    int quantity = 0;
                    do {
                        try {
                            System.out.print("Nhập số lượng sản phẩm: ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập sai định dạng");
                        }
                    } while (true);

                    System.out.print("Nhập thông tin: ");
                    String info = scanner.nextLine();

                    String str = id + "," + name + "," + price + "," + quantity + "," + info;
                    productRepository.editProduct(product,str);
                    System.out.println("Sản phẩm đã được sửa!");
                    break;
                }
            }
        } while (true);
    }
}

