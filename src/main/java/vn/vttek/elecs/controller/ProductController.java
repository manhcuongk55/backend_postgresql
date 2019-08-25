package vn.vttek.elecs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.vttek.elecs.entities.Product;
import vn.vttek.elecs.exception.ResourceNotFoundException;
import vn.vttek.elecs.repository.ProductRepository;

import javax.validation.Valid;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public Page<Product> getProduct(Pageable pageable) {
        return (Page<Product>) productRepository.findAll();
    }


    @PostMapping("/product")
    public Product createProduct(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/product/{productId}")
    public Product updateQuestion(@PathVariable Long productId,
                                  @Valid @RequestBody Product productRequest) {
        return productRepository.findById(productId)
                .map(product -> {
                    product.setItem_number(productRequest.getItem_number());
                    product.setName(productRequest.getName());
                    product.setDescription(productRequest.getDescription());
                    product.setCreated_by_id(productRequest.getCreated_by_id());
                    product.setCreated_on(productRequest.getCreated_on());
                    product.setModified_by_id(productRequest.getModified_by_id());
                    product.setModified_on(productRequest.getModified_on());
                    product.setState(productRequest.getState());

                    return productRepository.save(product);
                }).orElseThrow(() -> new ResourceNotFoundException("product not found with id " + productId));
    }


    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId) {
        return productRepository.findById(productId)
                .map(product -> {
                    productRepository.delete(product);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("product not found with id " + productId));
    }
}
