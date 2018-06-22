package com.ecommerce.domain.product;

import java.util.List;

public class ProductPage {
    // jest stroną wyszukiwania produktów przez użytkownika
    List<ProductSnapshot> productSnapshotList;
    ProductFilter filter;
    String searchKeyword;
    int startNr, endNr;
}
