package com.graphql.springbootgraphql.resource;

import com.graphql.springbootgraphql.entity.Product;
import com.graphql.springbootgraphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getProducts() {

        return productService.getProducts();
    }

    @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category){

        return productService.getProductsByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int id,@Argument int stock){
        return productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product recieveNewShipment(@Argument int id,@Argument int quantity){
        return productService.recieveNewShipment(id, quantity);
    }

}
