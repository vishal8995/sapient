package com.vishal.sapient.service;

import com.vishal.sapient.pojo.Product;
import com.vishal.sapient.util.ProductUtil;
import com.vishal.sapient.view.ProductSaveRequest;
import com.vishal.sapient.view.ProductSaveResponse;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    Product product = new Product();
    ProductUtil productUtil = new ProductUtil();
    public static final Map<String, Product> cache = new HashMap<>();


    public ProductSaveResponse saveDetails (ProductSaveRequest productSaveRequest){
        product.setPrice(productSaveRequest.getPrice());
        product.setProductName(productSaveRequest.getProductName());

        cache.put(productSaveRequest.getUniversalID(), product);
        return new ProductSaveResponse(productSaveRequest);
    }

    public String getDetails (int n, boolean v){
        String result = productUtil.findNthHighestPrice(cache, n, v);
        return result;
    }


}
