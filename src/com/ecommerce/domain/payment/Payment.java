package com.ecommerce.domain.payment;

import com.ecommerce.domain.order.OrderID;

public class Payment {
    // przewchowuje dane o sposobie płatności
    private CreditCard card;
    private OrderID id;

    public Payment(CreditCard card, OrderID id) {
        this.card = card;
        this.id = id;
    }

    public CreditCard getCard() {
        return card;
    }

    public OrderID getId() {
        return id;
    }
}
