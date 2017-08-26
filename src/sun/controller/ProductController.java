package sun.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sun.domain.Product;
import sun.from.ProductFrom;
import sun.service.ProductService;

import javax.annotation.Resource;

@Controller
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class);


    @Resource(name = "productServiceImpl")
    private ProductService mProductService;

    @RequestMapping(value = "/product_input")
    public String inputProduct() {
        logger.info("inputProduct is called");
        return "ProductFrom";
    }

    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    public String saveProduct(ProductFrom productFrom, RedirectAttributes redirectAttributes) {
        logger.info("saveProduct is called");
        Product product = new Product();
        product.setName(productFrom.getName());
        product.setDescription(productFrom.getDescription());
        try {
            product.setPrice(Float.parseFloat(productFrom.getPrice()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //add product
        Product saveProduct = mProductService.add(product);
        redirectAttributes.addFlashAttribute("message", "The product was successfully added!");

        return "redirect:/product_view/" + saveProduct.getId();
    }

    @RequestMapping(value = "/product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        model.addAttribute("product", mProductService.get(id));
        return "ProductDetail";
    }
}
