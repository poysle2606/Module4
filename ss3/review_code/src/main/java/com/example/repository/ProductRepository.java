package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone 11", 17000, "Used", "China"));
        productList.add(new Product(2, "Samsung", 18000, "Used", "USA"));
        productList.add(new Product(3, "Nokia", 19000, "Used", "Korean"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(Integer id) {
        Product product = null;
        for (Product product1: productList) {
            if(product1.getId().equals(id)){
                product = new Product(product1.getId(), product1.getName(), product1.getPrice(), product1.getDescription(), product1.getProduction());
            }
        }
        return product;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList1 = new ArrayList<>();
        for (Product product: productList) {
            if(product.getName().contains(name)){
                productList1.add(product);
            }
        }
        return productList1 ;
    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                productList.remove(productList.get(i));
            }
        }
    }
}
