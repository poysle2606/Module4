package com.example.dto;

public class ProductDto {
    private int id;
    private String name;
    private String image;
    private String describe;
    private long price;

    public ProductDto() {
    }

    public ProductDto(int id, String name, String image, String describe, long price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.describe = describe;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
