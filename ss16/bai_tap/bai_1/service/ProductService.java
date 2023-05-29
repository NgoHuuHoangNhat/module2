package ss16.bai_tap.bai_1.service;

import ss16.bai_tap.bai_1.exception.InputIsToLong;
import ss16.bai_tap.bai_1.exception.InputIsToShort;
import ss16.bai_tap.bai_1.exception.NumberIsToBig;
import ss16.bai_tap.bai_1.exception.NumberIsToSmall;
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
            String checkId = null;
            try {
                checkId = scanner.nextLine();
                if (checkId.length() < 5) {
                    throw new InputIsToShort();
                }
                if (checkId.length() > 10) {
                    throw new InputIsToLong();
                }
                break;
            } catch (InputIsToShort e) {
                System.out.println("**************************");
                System.out.println("Mã quá ngắn, mời nhập lại!");
                System.out.println("**************************");
                add();

            } catch (InputIsToLong e) {
                System.out.println("**************************");
                System.out.println("Mã quá dài, mời nhập lại!");
                System.out.println("**************************");
                add();

            }

            Product product = productRepository.getProductByID(checkId);
            if (product != null) {
                System.out.println("***************************************************************************");
                System.out.println("Sản phẩm " + product.getName() + " đã có trong danh sách, vui lòng nhập lại mã!");
                System.out.println("***************************************************************************");
            } else {
                String newName = null;
                while (true) {
                    System.out.print("Nhập tên sản phẩm: ");
                    try {
                        newName = scanner.nextLine();
                        if (newName.length() < 5) {
                            throw new InputIsToShort();
                        }
                        if (newName.length() > 10) {
                            throw new InputIsToLong();
                        }
                        break;
                    } catch (InputIsToLong e) {
                        System.out.println("**************************");
                        System.out.println("Mã quá ngắn, mời nhập lại!");
                        System.out.println("**************************");
                        break;
                    } catch (InputIsToShort e) {
                        System.out.println("**************************");
                        System.out.println("Mã quá dài, mời nhập lại!");
                        System.out.println("**************************");
                        break;
                    }

                }
                float newPrice = 0;
                while (true) {
                    System.out.print("Nhập giá sản phẩm: ");

                    try {
                        newPrice = Float.parseFloat(scanner.nextLine());
                        if (newPrice < 1000) {
                            throw new NumberIsToSmall();
                        }
                        if (newPrice > 30000000) {
                            throw new NumberIsToBig();
                        }
                        break;
                    } catch (NumberFormatException numberFormatException) {
                        System.out.println("**************************************");
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
                        System.out.println("**************************************");
                    } catch (NumberIsToBig e) {
                        System.out.println("**********************************************************************");
                        System.out.println("Giá quá cao, cửa hàng không nhập sản phẩm này, vui lòng nhập giá khác!");
                        System.out.println("**********************************************************************");

                    } catch (NumberIsToSmall e) {
                        System.out.println("***********************************************************");
                        System.out.println("Sản phẩm có giá thấp nhất là 1000đ, vui lòng nhập giá khác!");
                        System.out.println("***********************************************************");
                    }
                }

                String newManufacturer = null;
                while (true) {
                    System.out.print("Nhập hãng sản xuất: ");
                    try {
                        newManufacturer = scanner.nextLine();
                        if (newManufacturer.length() == 0) {
                            throw new InputIsToShort();
                        }
                        if (newManufacturer.length() > 50) {
                            throw new InputIsToLong();
                        }
                        break;
                    } catch (InputIsToLong e) {
                        System.out.println("**************************");
                        System.out.println("Mã quá dài, mời nhập lại!");
                        System.out.println("**************************");
                        break;

                    } catch (InputIsToShort e) {
                        System.out.println("**************************");
                        System.out.println("Mã quá ngắn, mời nhập lại!");
                        System.out.println("**************************");
                        break;
                    }

                }

                String newDetail = null;
                while (true) {
                    System.out.println("Nhập mô tả sản phẩm: ");
                    try {
                        newDetail = scanner.nextLine();
                        if (newDetail.length() < 5) {
                            throw new InputIsToShort();
                        }
                        if (newDetail.length() > 1000) {
                            throw new InputIsToLong();
                        }
                        break;
                    } catch (InputIsToLong e) {
                        System.out.println("**************************");
                        System.out.println("Mã quá dài, mời nhập lại!");
                        System.out.println("**************************");
                    } catch (InputIsToShort e) {
                        System.out.println("**************************");
                        System.out.println("Mã quá dài, mời nhập lại!");
                        System.out.println("**************************");
                    }
                }
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

            String checkName = null;
            while (true) {
                System.out.print("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
                try {
                    checkName = scanner.nextLine();
                    if (checkName.length() == 0) {
                        throw new InputIsToShort();
                    }
                    if (checkName.length() > 50) {
                        throw new InputIsToLong();
                    }
                    break;
                } catch (InputIsToLong e) {
                    System.out.println("**************************");
                    System.out.println("Tên quá dài, mời nhập lại!");
                    System.out.println("**************************");
                } catch (InputIsToShort e) {
                    System.out.println("***************************");
                    System.out.println("Tên quá ngắn, mời nhập lại!");
                    System.out.println("***************************");
                }
            }

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
