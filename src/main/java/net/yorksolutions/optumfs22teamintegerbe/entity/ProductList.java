package net.yorksolutions.optumfs22teamintegerbe.entity;

import javax.persistence.*;

@Entity
public class ProductList {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;
    private Integer count;
    @OneToOne
    private Product product;

    public ProductList() {
    }

    public ProductList(Integer count, Product product) {
        this.count = count;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
