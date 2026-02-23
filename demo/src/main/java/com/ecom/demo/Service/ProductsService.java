package com.ecom.demo.Service;

import com.ecom.demo.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductsService {
    List<Product> dummyProducts= Arrays.asList(
            new Product(1,"mobile",50000),
            new Product(2,"laptop",90000),
            new Product(1,"cosmetics",10000)
            );
   public List<Product> getProducts(){
        return dummyProducts;
    }
    public Product getProductsById(int prodId){
       return dummyProducts.stream()
               .filter(p ->p.getProdId()==prodId)
               .findFirst().get();
    }
}
