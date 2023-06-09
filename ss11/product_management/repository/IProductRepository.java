package ss11.product_management.repository;

import ss11.product_management.model.product.Product;

import java.util.List;

public interface IProductRepository {
    List getAll();

    Product getById(String checkId);

    void add(Product newProduct);

    void remove(Product product);

    List<Product> getByName(String name);

    void setProduct(Product product, String newName, float newPrice, int newQuantity, String newDetails);

    void sortUp();

    void sortDown();
}
