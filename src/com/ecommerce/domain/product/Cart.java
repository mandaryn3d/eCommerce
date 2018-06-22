package com.ecommerce.domain.product;

import com.ecommerce.domain.client.ClientID;
import com.ecommerce.domain.utils.Money;

import java.util.List;

public class Cart {
    private List<ProductSnapshot> productSnapshotList;
    private ClientID id;

    public List<ProductSnapshot> viewProductsInCart(){
        return productSnapshotList;
    }

    public Cart(ClientID id){
        this.id = id;
        this.productSnapshotList = new ArrayList<ProductSnapshot>();
    }

    // obliczamy wstępną cenę
    public Money getTotalPrice(){
        Money sum = new Money(0);
        for(ProductSnapshot snapshot: this.productSnapshotList){
            sum += snapshot.getPrice();
        }
    }

    void addProductToCart(ProductID id){
        Product toAdd = Product.findById(id);
        productSnapshotList.add(toAdd.getProductSnapshot());
    }

    void removeProductFromCart(ProductID id){
        for(ProductSnapshot snapshot: this.productSnapshotList){
            if(snapshot.getId().equals(id)){
                this.productSnapshotList.remove(snapshot);
                break;
            }
        }
    }
}
