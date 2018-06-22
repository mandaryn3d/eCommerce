package com.ecommerce.domain.product;

import com.ecommerce.domain.utils.Money;
import com.ecommerce.domain.utils.Picture;

public class ProductSnapshot {
    // zawiera kompaktowy zbiór informacji o produkcie
    private ProductID id;
    private String name;
    private Picture minature;
    private Money price;

    public ProductSnapshot(ProductID id, String name, Picture minature, Money price) {
        this.id = id;
        this.name = name;
        this.minature = minature;
        this.price = price;
    }

    public ProductID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Picture getMinature() {
        return minature;
    }

    public Money getPrice() {
        return price;
    }
}
