package com.ecom.demo.Service;
import com.ecom.demo.Model.Product;
import com.ecom.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductsService {
    @Autowired
    ProductRepository repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductsById(int prodId){
        return repo.findById(prodId)
                .orElseThrow(()-> new RuntimeException("product not found"));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public List<Product> getProductsByPriceLessThan(double price) {
        return repo.findProductsByPriceLessThan(price);
    }
}
