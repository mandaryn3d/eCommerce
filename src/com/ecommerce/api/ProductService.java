package com.ecommerce.api;
import com.ecommerce.domain.product.Product;
import com.ecommerce.domain.product.ProductFilter;
import com.ecommerce.domain.product.ProductID;
import com.ecommerce.domain.product.ProductPage;

public interface ProductService {
    // zwraca 1 produkt z pełnym opisem
    Product findProductById(ProductID id);

    // zwraca strone wyszukiwania produktów stworzoną na podstawie filtra
    ProductPage findProductsByCriteria(ProductFilter filter);
}
