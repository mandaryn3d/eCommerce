package com.ecommerce.domain.payment;

public interface PaymentFacade {
    // wysyła żądanie do zewnętrznego systemu o zrealizowanie płatności
    PaymentStatus requestPayment(Payment payment);
}
