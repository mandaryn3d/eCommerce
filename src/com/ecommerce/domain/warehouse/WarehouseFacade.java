package com.ecommerce.domain.warehouse;

import com.ecommerce.domain.order.OrderID;

public interface WarehouseFacade {
    // za pomocą fasady, wysyłamy id zamówienia do magazynu
    // żeby magazyn mógł wysłać produkty do klienta
    void sendOrder(OrderID id);
}