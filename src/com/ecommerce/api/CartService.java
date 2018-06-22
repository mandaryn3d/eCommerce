package com.ecommerce.api;


import com.ecommerce.domain.product.*;

public interface CartService {
    // umożliwia zarządzanie koszykiem
    // koszyk jest obiektem mutowalnym

    void addProductToCart(ProductID id);
    void removeProductFromCart(ProductID id);

    Cart getCart();
}
