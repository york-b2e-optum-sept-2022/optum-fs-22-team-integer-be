package net.yorksolutions.optumfs22teamintegerbe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CouponCode {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date endDate;

    private Long useLimit;
    private Long storePercent;

    public CouponCode() {}

    public CouponCode(String name,
                      Date startDate,
                      Date endDate,
                      Long useLimit,
                      Long storePercent) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.useLimit = useLimit;
        this.storePercent = storePercent;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(Long useLimit) {
        this.useLimit = useLimit;
    }

    public Long getStorePercent() {
        return storePercent;
    }

    public void setStorePercent(Long storePercent) {
        this.storePercent = storePercent;
    }
}