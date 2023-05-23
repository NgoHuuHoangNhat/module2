package ss11.product_management.repository.product_repository;

import ss11.product_management.model.product.Product;
import ss11.product_management.repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("P-001", "Oreo", 15000, 100, "Bánh oreo rất ngon"));
        productList.add(new Product("P-002", "Chocopice", 50000, 50, "Bánh chocopice rất ngon"));
        productList.add(new Product("P-003", "Bông lan", 4000, 70, "Bánh bông lan rất ngon"));
        productList.add(new Product("P-003", "Bông lan 2", 4000, 70, "Bánh bông lan rất ngon"));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product getById(String checkId) {
        for (Product product : productList) {
            if (product.getId().equals(checkId)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void add(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public void remove(Product product) {
        productList.remove(product);
    }

    @Override
    public List<Product> getByName(String name) {
        List<Product> newList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
               newList.add(product);
            }

        }
        if(newList.size() > 0){
            return  newList;
        }else {
            return null;
        }
    }

    @Override
    public void setProduct(Product product, String newName, float newPrice, int newQuantity, String newDetails) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(product)) {
                productList.get(i).setName(newName);
                productList.get(i).setPrice(newPrice);
                productList.get(i).setQuantity(newQuantity);
                productList.get(i).setDetails(newDetails);
            }
        }
    }

    @Override
    public void sortUp() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    @Override
    public void sortDown() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

}
