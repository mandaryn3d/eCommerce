package com.ecommerce.domain.product;

import com.ecommerce.domain.utils.Money;
import javafx.util.Pair;

import java.util.List;

public class ProductFilter {
    // zawiera kryteria filtrowania produktów
    String name;
    Pair<Money, Money> priceRange;
    List<String> tags;
    String description;

    public ProductFilter(String name, Pair<Money, Money> priceRange, List<String> tags, String description) {
        this.name = name;
        this.priceRange = priceRange;
        this.tags = tags;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Pair<Money, Money> getPriceRange() {
        return priceRange;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getDescription() {
        return description;
    }
}
