package com.vishal.sapient.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable<Product>{

    private String productName;
    private float price;

    @Override
    public int compareTo(Product o) {
        return (int)(this.getPrice() - o.getPrice());
    }
}
