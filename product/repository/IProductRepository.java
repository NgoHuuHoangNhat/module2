package product.repository;

import product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    Product getById(String id);

    void addProduct(String str);

    void remove(Product product);

    List<Product> getByName(String name);

    void editProduct(Product product, String str);
}
