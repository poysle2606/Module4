package com.example.dto;

import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<ProductDto,Integer> productMap = new HashMap<>();

    public CartDto() {
    }

    public CartDto(Map<ProductDto, Integer> productMap) {
        this.productMap = productMap;
    }

    public Map<ProductDto, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<ProductDto, Integer> productMap) {
        this.productMap = productMap;
    }

    public void addProduct(ProductDto productDto){
        if(productMap.containsKey(productDto)){
            int countProduct = productMap.get(productDto);
            productMap.replace(productDto, countProduct + 1); //kiểm tra đã có thì sẽ + 1 lên
        } else {
            productMap.put(productDto, 1); // chưa có thì để là 1
        }
    }
}
