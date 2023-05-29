package ss16.bai_tap.bai_1.repository;

import ss16.bai_tap.bai_1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    Product getProductByID(String checkId);

    void addProduct(String checkId, String newName, float newPrice, String newManufacturer, String newDetail);

    List<Product> getProductByName(String checkName);
}
