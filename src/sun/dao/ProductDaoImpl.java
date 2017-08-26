package sun.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import sun.domain.Product;
import sun.mapper.ProductMapper;

import javax.annotation.Resource;
import java.util.List;

@Repository("productDaoImpl")
public class ProductDaoImpl implements IProductDao{

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

//    public ProductDaoImpl(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/sun_db");
//        dataSource.setUsername("root");
//        dataSource.setPassword("sunxuedian");
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }


    @Override
    public void addProduct(Product product) {

    }

    @Override
    public Product getProduct(long id) {
        return null;
    }

    @Override
    public void deleteProduct(long id) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Product searchProduct(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> list;
        String sql = "select * from product";
        list = jdbcTemplate.query(sql, new ProductMapper());
        return list;
    }
}
