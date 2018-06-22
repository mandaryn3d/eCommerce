package com.ecommerce.domain.discounts;

import com.ecommerce.domain.order.Order;
import com.ecommerce.domain.utils.Money;

public class FreeDeliveryDiscount implements Discount {
    @Override
    public Money applyDiscount(Order order) {
        if (Money(300) =< order.getProductCost())
            return Money(order.getDeliveryCost());
        return 0;
    }
}
