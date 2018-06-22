package com.ecommerce.domain.discounts;

import com.ecommerce.domain.order.Order;
import com.ecommerce.domain.utils.Money;

public interface Discount {
    // przechowuje informacje o wysokości rabatu i o tym do czego się aplikuje rabat
    // zwraca wartość zamówienia po rabacie
    Money applyDiscount(Order order);
}
