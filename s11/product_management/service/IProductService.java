package s11.product_management.service;

import s11.product_management.model.product.Product;

public interface IProductService {
    void display();

    void add();

    void remove();

    void searchProduct();

    void editProduct();

    void sortByPrice();
}
