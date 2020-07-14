package com.vishal.sapient.controller;

import com.vishal.sapient.service.ProductService;
import com.vishal.sapient.view.ProductSaveRequest;
import com.vishal.sapient.view.ProductSaveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public ProductSaveResponse save(@RequestBody ProductSaveRequest productSaveRequest){
        ProductSaveResponse productSaveResponse = productService.saveDetails(productSaveRequest);
        return productSaveResponse;
    }

    @GetMapping("/fetch")
    public String fetch(@RequestParam int n, @RequestParam boolean v){
        return productService.getDetails(n, v);
    }
}
