package com.vishal.sapient.util;

import com.vishal.sapient.pojo.Product;
import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.stream.Collectors;

public class ProductUtil {
    private Object String;
    private Object Product;

    public String findNthHighestPrice (Map<String, Product> cache, int n, boolean v){

        Map.Entry<String, Product> entry =
                cache.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList())
                .get(n);

        if(v)
            return entry.getKey();
        else
            return entry.getValue().getProductName();
    }
}
