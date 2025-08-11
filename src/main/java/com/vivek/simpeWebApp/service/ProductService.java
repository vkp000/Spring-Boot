package com.vivek.simpeWebApp.service;

import com.vivek.simpeWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Iq T1 Pro", 18278),
            new Product(103, "Lava 1 Pro", 18278)
    ));


    public List<Product> getProducts(){

        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p-> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index= 0;

        for(int i=0; i<products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                index = i;
            }

        }

        products.set(index,prod);

    }


}
