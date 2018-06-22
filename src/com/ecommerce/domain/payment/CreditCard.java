package com.ecommerce.domain.payment;

import java.util.Date;

public class CreditCard {
    // VO do przechowywania danych karty
    private String cardNumber;
    private Date expirationDate;
    private int CVC;

    public CreditCard(String cardNumber, Date expirationDate, int CVC) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.CVC = CVC;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getCVC() {
        return CVC;
    }

    public boolean validate() {
        // walidacja poprawnosci podanych danych karty
        // obliczanie sumy kontrolnej, itd
        return true;
    }
}
