package sun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.dao.IProductDao;
import sun.dao.ProductDaoImpl;
import sun.domain.Product;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {

    private Map<Long, Product> mProducts = new HashMap<>();
    private AtomicLong generator = new AtomicLong();


    @Resource(name = "productDaoImpl")
    private ProductDaoImpl dao;

    public ProductServiceImpl(){
        Product product = new Product();
        product.setName("InitProduct");
        product.setDescription("This is a first product!");
        product.setPrice(100.11f);
        add(product);
    }

    @Override
    public Product add(Product product) {

        dao.getAllProduct();

        long newId = generator.incrementAndGet();
        product.setId(newId);
        mProducts.put(newId, product);
        return product;
    }

    @Override
    public Product get(long id) {
        return mProducts.get(id);
    }
}
