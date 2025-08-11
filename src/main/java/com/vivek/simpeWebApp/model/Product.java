package com.vivek.simpeWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor   // generates constructor with all fields
@NoArgsConstructor    // generates no-args constructor for JSON deserialization
public class Product {
    private int prodId;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    private String prodName;
    private int price;
}
