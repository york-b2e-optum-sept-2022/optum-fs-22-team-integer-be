package net.yorksolutions.optumfs22teamintegerbe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CouponCodes {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;

    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date endDate;

    private Long useLimit;
    private Long storePercent;

    public CouponCodes() {}

    public String getName() {
        return name;
    }