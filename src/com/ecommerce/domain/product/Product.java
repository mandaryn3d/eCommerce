package com.ecommerce.domain.product;

import com.ecommerce.domain.utils.Money;
import com.ecommerce.domain.utils.Picture;

import java.util.List;

public class Product {
    // przechowuje pełny zestaw danych na temat produktu

    public Product(ProductID id, String description, String name, Money price, List<String> tags, List<Picture> pictures, List<String> categories) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
        this.tags = tags;
        this.pictures = pictures;
        this.categories = categories;
    }

    public ProductID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Picture> getPictures() {

        return pictures;
    }

    public List<String> getCategories() {
        return categories;
    }

    private ProductID id;
    private String description;
    private String name;
    private Money price;
    private List<String> tags;
    private List<Picture> pictures;
    private List<String> categories;

    public ProductSnapshot generateProductSnapshot(){
        return new ProductSnapshot(this.id,this.name,this.pictures.get(0),this.price);
    }
}
