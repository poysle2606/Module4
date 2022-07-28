package com.example.dto;

import com.example.model.MyProduct;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<MyProduct,Integer> productMap = new HashMap<>();

    public CartDto() {
    }

    public CartDto(Map<MyProduct, Integer> productMap) {
        this.productMap = productMap;
    }

    public Map<MyProduct, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<MyProduct, Integer> productMap) {
        this.productMap = productMap;
    }

    private boolean checkItemProduct(MyProduct product){
        for (Map.Entry<MyProduct,Integer> entry:productMap.entrySet()) {
            if(entry.getKey().getId() == product.getId()){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<MyProduct, Integer> selectItemInCart(MyProduct product){
        for (Map.Entry<MyProduct,Integer> entry:productMap.entrySet()){
            if(entry.getKey().getId() == product.getId()){
                return entry;
            }
        }
        return null;
    }

    public void addProduct(MyProduct product){
        if(!checkItemProduct(product)){
            productMap.put(product,1);
        } else {
            Map.Entry<MyProduct,Integer> integerEntry = selectItemInCart(product);
            int number = integerEntry.getValue() + 1;
            productMap.replace(integerEntry.getKey(), number);
        }
    }

    public void remove(MyProduct product){
        if(!checkItemProduct(product)){
            productMap.put(product,1);
        } else {
            Map.Entry<MyProduct,Integer> integerEntry = selectItemInCart(product);
            int number = integerEntry.getValue() - 1;
            productMap.replace(integerEntry.getKey(), number);
        }
    }

    public int countProductQuantity(){   // đếm số lươngj sản phẩm đó trong giỏ hàng
        int productQuantity = 0;
        for(Map.Entry<MyProduct,Integer> entry : productMap.entrySet()){
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public int countItem(){   //đếm số lượng có trong giỏ hàng
        return productMap.size();
    }

    public long countTotalPayment(){   //tổng tiền thanh toán
        long payment = 0;
        for(Map.Entry<MyProduct,Integer> entry : productMap.entrySet()){
            payment += entry.getKey().getPrice() * entry.getValue();
        }
        return payment;
    }
}
