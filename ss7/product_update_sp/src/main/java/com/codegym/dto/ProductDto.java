package com.codegym.dto;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class ProductDto {
    private Integer id;

    @NotBlank(message = "Here is Empty!")
    @Size(max = 55)
    //    @Pattern( regexp = "^[a-zA-Z]]*",message = "Enter only letters, do not enter numbers")
    private String name;

    @Range(min = 0, max = 50000)
    private Double price;

    @NotBlank(message = "Here is Empty!")
    private String production;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, Double price, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
