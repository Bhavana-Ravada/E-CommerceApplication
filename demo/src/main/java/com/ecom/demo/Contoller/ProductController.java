package com.ecom.demo.Contoller;

import com.ecom.demo.Model.Product;
import com.ecom.demo.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductsService prodServ;
    @RequestMapping("/products")
    List<Product> getProducts(){
        return prodServ.getProducts();
    }

    @GetMapping("/products/{prodId}")
    Product getProductsById(@PathVariable int prodId){
        return prodServ.getProductsById(prodId);
    }

    @PostMapping("/Products")
    void addProducts(@RequestBody Product prod){
        prodServ.addProduct(prod);
    }
    @PutMapping("/products")
    void updateProducts(@RequestBody Product prod){
        prodServ.updateProduct(prod);
    }
}
