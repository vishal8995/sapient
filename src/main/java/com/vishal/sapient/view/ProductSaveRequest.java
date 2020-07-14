package com.vishal.sapient.view;

import com.vishal.sapient.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductSaveRequest {

    private String universalID;
    private String productName;
    private float price;
}
