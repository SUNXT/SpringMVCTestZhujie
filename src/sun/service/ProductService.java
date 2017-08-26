package sun.service;

import sun.domain.Product;

public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
