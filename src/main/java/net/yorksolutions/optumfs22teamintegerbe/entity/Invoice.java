package net.yorksolutions.optumfs22teamintegerbe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Invoice {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    Long id;
    public Long accountId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date purchaseDate;
    @OneToMany
    Set<PurchaseList> purchaseList;
    public Double totalPrice;
}
