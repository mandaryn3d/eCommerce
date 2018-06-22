package com.ecommerce.api;

import com.ecommerce.domain.order.Address;
import com.ecommerce.domain.order.DeliveryType;
import com.ecommerce.domain.order.Order;
import com.ecommerce.domain.order.OrderID;
import com.ecommerce.domain.payment.CreditCard;
import com.ecommerce.domain.payment.Payment;
import com.ecommerce.domain.product.Cart;

import java.util.List;

public interface OrderService {
    // sprawdza czy na dany adres można wysłać zamówienie w dany sposób
    List<DeliveryType> waysCanBeDelivered(Address address);

    //funkcja tworzy zamówienie
    // w implementacji przydzielane są rabaty
    Order createOrder(Cart cart, Address address, DeliveryType type);

    // dodajemy info o karcie kredytowej
    Payment pay(CreditCard card, OrderID id);

    // potwierdzenie wysłania przesyłki z magazynu
    void confirmSendOrder(OrderID id);

}
