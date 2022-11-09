package net.yorksolutions.optumfs22teamintegerbe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseList {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    public Long id;
    public Long count;
    public String name;
    public Double price;
}
