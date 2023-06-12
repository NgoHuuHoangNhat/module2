package product.repository.imp;

import product.common.File;
import product.model.Product;
import product.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    private static final String PRODUCT_PATH = "product\\file\\product_file.csv";

    @Override
    public List<Product> getAll() {
        productList.clear();
        List<String> stringList = File.readFile(PRODUCT_PATH);
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            productList.add(new Product(info[0], info[1], Double.parseDouble(info[2]), Integer.parseInt(info[3]), info[4]));
        }

        return productList;
    }

    @Override
    public Product getById(String id) {
        productList = getAll();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(String str) {
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        File.writeFile(stringList, PRODUCT_PATH, true);
    }

    @Override
    public void remove(Product product) {
        productList = getAll();
        productList.remove(product);
        List<String> stringList = new ArrayList<>();

        for (Product p : productList) {
            stringList.add(p.getId() + "," + p.getName() + "," + p.getPrice() + "," + p.getQuantity() + "," + p.getInfo());
        }
        File.writeFile(stringList, PRODUCT_PATH, false);
    }

    @Override
    public List<Product> getByName(String name) {
        productList = getAll();
        List<Product> list = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(p);
            }
        }
        if (list.size() == 0) {
            return null;
        }
        return list;
    }

    @Override
    public void editProduct(Product product, String str) {
        productList = getAll();
        String[] arr = str.split(",");
        for (Product p : productList) {
            if (p.equals(product)) {
                p.setName(arr[1]);
                p.setPrice(Double.parseDouble(arr[2]));
                p.setQuantity(Integer.parseInt(arr[3]));
                p.setInfo(arr[4]);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product p : productList) {
            stringList.add(p.getId() + "," + p.getName() + "," + p.getPrice() + "," + p.getQuantity() + "," + p.getInfo());
        }
        File.writeFile(stringList,PRODUCT_PATH,false);

    }
}
