package net.yorksolutions.optumfs22teamintegerbe.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @Column(unique = true)
    private Long accountId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    Set<ProductList> productList;
    Double totalPrice;

    public Cart(){}
    public Cart(Set<ProductList> productList, Double totalPrice) {
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Set<ProductList> getProductList() {
        return productList;
    }

    public void setProductList(Set<ProductList> productList) {
        this.productList = productList;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
