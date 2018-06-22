package com.ecommerce.domain.client;

import com.ecommerce.domain.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private ClientID id;
    private List<Order> transactions = new ArrayList<Order>();

    public Client(ClientID id) {
        this.id = id;
    }

    public ClientID getId() {
        return id;
    }

    public List<Order> getTransactions() {
        return transactions;
    }

    public void addTransaction(Order transaction){
        transactions.add(transaction);
    }
}
