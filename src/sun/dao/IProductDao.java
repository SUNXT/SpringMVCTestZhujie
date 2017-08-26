package sun.dao;

import sun.domain.Product;

import java.util.List;

public interface IProductDao {
    void addProduct(Product product);
    Product getProduct(long id);
    void deleteProduct(long id);
    void updateProduct(Product product);
    Product searchProduct(long id);
    List<Product> getAllProduct();
}
