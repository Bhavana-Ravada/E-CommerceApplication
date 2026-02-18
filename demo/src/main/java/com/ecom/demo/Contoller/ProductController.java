package com.ecom.demo.Contoller;

import com.ecom.demo.Model.Product;
import com.ecom.demo.Service.ProductService;
import com.ecom.demo.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductsService prodServ;
    @RequestMapping("/products")
    List<Product> getProducts(){
        return prodServ.getProducts();
    }
}
