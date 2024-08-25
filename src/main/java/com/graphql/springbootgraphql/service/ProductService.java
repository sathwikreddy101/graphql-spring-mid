package com.graphql.springbootgraphql.service;

import com.graphql.springbootgraphql.entity.Product;
import com.graphql.springbootgraphql.repository.ProductRepository;
import com.graphql.springbootgraphql.resource.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public Product updateStock(int id, int stock) {
        Product existingProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("product not found with id" + id));
        existingProduct.setStock(stock);
        return productRepository.save(existingProduct);
    }

    public Product recieveNewShipment(int id, int quantity){
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("product not found with id" + id));
        existingProduct.setStock(existingProduct.getStock() + quantity);
        return productRepository.save(existingProduct);
    }
}
