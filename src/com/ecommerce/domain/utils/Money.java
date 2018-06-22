package com.ecommerce.domain.utils;

import java.math.BigDecimal;

public class Money {
    // klasa przechowująca pieniądze
    public Money(BigDecimal value) {
    }
    public Money(int value) {
    }


    public Money add(Money other) {
        return this + other;
    }
}
