package com.morsaprogramando.secret_manager.models;

public class Product {
    private long id;
    private String Category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
