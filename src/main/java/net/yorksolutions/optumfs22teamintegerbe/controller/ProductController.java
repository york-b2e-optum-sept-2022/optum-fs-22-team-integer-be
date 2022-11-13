package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.dto.NewProductRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.dto.UpdateProductRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Cart;
import net.yorksolutions.optumfs22teamintegerbe.entity.Product;
import net.yorksolutions.optumfs22teamintegerbe.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return this.productService.create(product);
    }

    @PostMapping("/addList")
    public Iterable<Product> create(@RequestBody List<NewProductRequestDTO> productList ) {
        return this.productService.addCreateList(productList);
    }

    @GetMapping
    public Iterable<Product> getCartList() {
        return this.productService.getAllProducts();

    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return this.productService.update(product);
    }

    @DeleteMapping("/{id}")

    public void deleteProduct(@PathVariable Long id) {
        this.productService.delete(id);
    }

}
