package com.techbuddy.snkrlab3.models;

public class Brands{

    String brandName;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Brands(String brandName, Integer imageUrl) {
        this.brandName = brandName;
        this.imageUrl = imageUrl;
    }

    public String getbrandName() {
        return brandName;
    }

    public void setbrandName(String brandName) {
        this.brandName = brandName;
    }

}
