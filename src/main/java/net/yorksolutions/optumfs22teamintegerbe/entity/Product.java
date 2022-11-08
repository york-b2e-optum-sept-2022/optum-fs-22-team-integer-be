package net.yorksolutions.optumfs22teamintegerbe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;

    private String description;
    private String image; // url possibility vs. string?
    private Double quantityAtCost;
    private Date dateAvailableOn;
    private String categories;


    private Boolean isDiscontinued;
    private Double storeQuantity;
    private Double msrp;
    private Date mapStartDate;
    private Date mapEndDate;
    private Date priceStartDate;
    private Date priceEndDate;
    private Double price;
    private Double currentPrice;
    private Date saleStartDate;
    private Date saleEndDate;
    private Long salePercentOff;





}
