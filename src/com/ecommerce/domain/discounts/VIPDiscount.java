package com.ecommerce.domain.discounts;

import com.ecommerce.domain.order.Order;
import com.ecommerce.domain.utils.Money;

public class VIPDiscount implements Discount {
    @Override
    public Money applyDiscount(Order order) {
        Money val =  new Money(0);
        val += order.getProductCost();
        val += order.getDeliveryCost();
        val *= 0.95;
        return val;
    }
}
