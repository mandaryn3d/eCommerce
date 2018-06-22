package com.ecommerce.domain.order;

import com.ecommerce.domain.product.ProductSnapshot;
import com.ecommerce.domain.utils.Money;

import java.util.Date;
import java.util.List;

public class Order {
    // zawiera listę produktów i koszt zamówienia
    private List<ProductSnapshot> productSnapshotList;
    private Money deliveryCost;
    private Address address;
    private Date orderDate;
    private DeliveryType type;

    public Order(List<ProductSnapshot> productSnapshotList, Money deliveryCost, Address address) {
        this.productSnapshotList = productSnapshotList;
        this.deliveryCost = deliveryCost;
        this.address = address;
        this.orderDate = Date.now();
    }

    public Address getAddress() {
        return address;
    }

    public List<ProductSnapshot> getProductSnapshotList() {
        return productSnapshotList;
    }

    public Money getProductCost() {
        Money sum = new Money(0);
        for(ProductSnapshot product: productSnapshotList) {
            sum.add(product.getPrice());
        }
        return sum;
    }
    public Money getDeliveryCost() {
        return deliveryCost;
    }

    public Money getTotalPrice() { return getProductCost().add(getDeliveryCost()); }
}
