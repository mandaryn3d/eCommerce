package com.ecommerce.api;

import com.ecommerce.domain.order.Order;
import com.ecommerce.domain.order.OrderID;
import com.ecommerce.domain.product.Product;
import com.ecommerce.domain.product.ProductID;
import com.ecommerce.domain.client.ClientID;

import java.util.List;

public interface AdministrationService {
    // dodawanie produktu do katalogu
    void addNewProduct(Product product);

    // aktualizacja istniejącego produktu
    void updateExistingProduct(ProductID id, Product newProduct);

    // ustawianie widoczności lub niewidoczności produktu
    void setProductVisible(ProductID id);
    void setProductInvisible(ProductID id);

    // wyszukiwanie zamówień po numerze zamówienia lub numerze klienta
    // szczegóły zamówienia są dostępne w klasie Order

    Order findOrderById(OrderID id);
    List<Order> findOrderByClient(ClientID id);
}
