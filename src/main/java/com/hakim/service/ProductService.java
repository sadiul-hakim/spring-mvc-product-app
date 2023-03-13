package com.hakim.service;

import com.hakim.entities.Product;
import com.hakim.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.createProduct(product);
    }

    public Product getProduct(Long id){
        return productRepository.getProduct(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

    public void deleteProduct(Long id){
        productRepository.deleteProduct(id);
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
