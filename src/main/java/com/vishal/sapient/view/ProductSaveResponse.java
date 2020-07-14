package com.vishal.sapient.view;

import com.vishal.sapient.pojo.Product;
import com.vishal.sapient.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductSaveResponse {

    private String universalID;
    private String productName;
    private float price;

    public ProductSaveResponse(ProductSaveRequest productSaveRequest) {
        this.universalID = productSaveRequest.getUniversalID();
        this.productName = productSaveRequest.getProductName();
        this.price = productSaveRequest.getPrice();
    }
}
