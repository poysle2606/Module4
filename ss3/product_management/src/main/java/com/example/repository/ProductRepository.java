package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone 11", 17.000, "China"));
        productList.add(new Product(2, "Iphone 12", 18.000, "America"));
        productList.add(new Product(3, "Iphone 13", 19.000, "Vietnam"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(Product product, Integer id) {
        for (Product items: productList) {
            if(items.getId().equals(id)){
                items.setId(product.getId());
                items.setName(product.getName());
                items.setPrice(product.getPrice());
                items.setProduction(product.getProduction());
            }
        }
    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                productList.remove(productList.get(i));
            }
        }

    }

    @Override
    public Product findById(Integer id) {
        Product product = null;
        for (Product items : productList) {
            if (items.getId().equals(id)) {
                product = new Product(items.getId(), items.getName(), items.getPrice(), items.getProduction());
            }
        }
        return product;
    }

    @Override
    public Product findName(String name) {
        return null;
    }
}
