package net.yorksolutions.optumfs22teamintegerbe.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    Set<ProductList> productList;
    Double totalPrice;
}
