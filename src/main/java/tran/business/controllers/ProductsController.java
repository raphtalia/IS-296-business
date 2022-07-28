package tran.business.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tran.business.models.Product;
import tran.business.services.ProductsService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public Product createProduct(@RequestBody Product product) {
        return productsService.createProduct(product);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<Product> readProducts() {
        return productsService.getProducts();
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.PUT)
    public Product readProducts(@PathVariable long productId, @RequestBody Product productDetails) {
        return productsService.updateProduct(productId, productDetails);
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable long productId) {
        productsService.deleteProduct(productId);
    }
}
