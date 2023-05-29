package ss16.bai_tap.bai_1.repository;

import ss16.bai_tap.bai_1.common.ProductBinaryFile;
import ss16.bai_tap.bai_1.model.Product;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    private static ProductBinaryFile productBinaryFile = new ProductBinaryFile();
    private static final String PRODUCT_LIST_PATH = "ss16\\bai_tap\\bai_1\\common\\product_list.dat";
//    static {
//        productList.add(new Product("P-001", "Bút Bi",3000,"Thiên Long","Viết chữ đẹp"));
//        productList.add(new Product("P-002", "Bánh Oreo",20000,"Oreo","Bánh ngon lắm"));
//        productList.add(new Product("P-003", "Kẹo mút",1000,"Chuppa Chups","Mút chùn chụt"));
//    }


    @Override
    public List<Product> getAll() {
        productList = productBinaryFile.readProductListFromFileDat(PRODUCT_LIST_PATH);
        return productList;
    }

    @Override
    public Product getProductByID(String checkId) {
        productList = productBinaryFile.readProductListFromFileDat(PRODUCT_LIST_PATH);
        for (Product product : productList) {
            if (product.getId().equals(checkId)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(String checkId, String newName, float newPrice, String newManufacturer, String newDetail) {
        productList = productBinaryFile.readProductListFromFileDat(PRODUCT_LIST_PATH);
        productList.add(new Product(checkId,newName,newPrice,newManufacturer,newDetail));
        productBinaryFile.writeProductListToFileDat(productList,PRODUCT_LIST_PATH);
    }

    @Override
    public List<Product> getProductByName(String checkName) {
        productList = productBinaryFile.readProductListFromFileDat(PRODUCT_LIST_PATH);
        List<Product> products = new ArrayList<>();
        for (Product product:productList) {
            if(product.getName().toLowerCase().contains(checkName.toLowerCase())){
                products.add(product);
            }
        }
        if(products.size() > 0){
            return products;
        }
        return null;
    }
}
