package com.vivek.simpeWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor   // generates constructor with all fields
@NoArgsConstructor
@Component
@Entity
// generates no-args constructor for JSON deserialization
public class Product {

    @Id
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
