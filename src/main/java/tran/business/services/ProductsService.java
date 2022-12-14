package tran.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tran.business.models.Product;
import tran.business.repositories.ProductsRepository;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    // CREATE
    public Product createProduct(Product product) {
        return productsRepository.save(product);
    }

    // READ
    public List<Product> getProducts() {
        return productsRepository.findAll();
    }

    // UPDATE
    public Product updateProduct(long productId, Product productDetails) {
        Product product = productsRepository.findById(productId).get();
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setInventory(productDetails.getInventory());
        product.setCost(productDetails.getCost());
        return productsRepository.save(product);
    }

    // DELETE
    public void deleteProduct(long empId) {
        productsRepository.deleteById(empId);
    }
}
