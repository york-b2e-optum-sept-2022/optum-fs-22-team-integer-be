package net.yorksolutions.optumfs22teamintegerbe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;

    private String description;
    private String image; // url possibility vs. string?
    private Double quantityAtCost;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateAvailableOn;

    @ElementCollection
    private List<String> categoryList;

    private Boolean isDiscontinued;
    private Double storeQuantity;
    private Double msrp;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date mapStartDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date mapEndDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date priceStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date priceEndDate;
    private Double price;
    private Double currentPrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date saleStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date saleEndDate;
    private Double salePercentOff;

    public Product() {}

    public Product(String description,
                   String image,
                   Double quantityAtCost,
                   Date dateAvailableOn,
                   List<String> categoryList,
                   Boolean isDiscontinued,
                   Double storeQuantity,
                   Double msrp, Date mapStartDate,
                   Date mapEndDate, Date priceStartDate,
                   Date priceEndDate,
                   Double price,
                   Double currentPrice,
                   Date saleStartDate,
                   Date saleEndDate,
                   Double salePercentOff) {
        this.description = description;
        this.image = image;
        this.quantityAtCost = quantityAtCost;
        this.dateAvailableOn = dateAvailableOn;
        this.categoryList = categoryList;
        this.isDiscontinued = isDiscontinued;
        this.storeQuantity = storeQuantity;
        this.msrp = msrp;
        this.mapStartDate = mapStartDate;
        this.mapEndDate = mapEndDate;
        this.priceStartDate = priceStartDate;
        this.priceEndDate = priceEndDate;
        this.price = price;
        this.currentPrice = currentPrice;
        this.saleStartDate = saleStartDate;
        this.saleEndDate = saleEndDate;
        this.salePercentOff = salePercentOff;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getQuantityAtCost() {
        return quantityAtCost;
    }

    public void setQuantityAtCost(Double quantityAtCost) {
        this.quantityAtCost = quantityAtCost;
    }

    public Date getDateAvailableOn() {
        return dateAvailableOn;
    }

    public void setDateAvailableOn(Date dateAvailableOn) {
        this.dateAvailableOn = dateAvailableOn;
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

    public Boolean getDiscontinued() {
        return isDiscontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        isDiscontinued = discontinued;
    }

    public Double getStoreQuantity() {
        return storeQuantity;
    }

    public void setStoreQuantity(Double storeQuantity) {
        this.storeQuantity = storeQuantity;
    }

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public Date getMapStartDate() {
        return mapStartDate;
    }

    public void setMapStartDate(Date mapStartDate) {
        this.mapStartDate = mapStartDate;
    }

    public Date getMapEndDate() {
        return mapEndDate;
    }

    public void setMapEndDate(Date mapEndDate) {
        this.mapEndDate = mapEndDate;
    }

    public Date getPriceStartDate() {
        return priceStartDate;
    }

    public void setPriceStartDate(Date priceStartDate) {
        this.priceStartDate = priceStartDate;
    }

    public Date getPriceEndDate() {
        return priceEndDate;
    }

    public void setPriceEndDate(Date priceEndDate) {
        this.priceEndDate = priceEndDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getSaleStartDate() {
        return saleStartDate;
    }

    public void setSaleStartDate(Date saleStartDate) {
        this.saleStartDate = saleStartDate;
    }

    public Date getSaleEndDate() {
        return saleEndDate;
    }

    public void setSaleEndDate(Date saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

    public Double getSalePercentOff() {
        return salePercentOff;
    }

    public void setSalePercentOff(Double salePercentOff) {
        this.salePercentOff = salePercentOff;
    }
}
