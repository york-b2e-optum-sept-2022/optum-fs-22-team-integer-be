package net.yorksolutions.optumfs22teamintegerbe.dto;

import java.util.Date;
import java.util.List;

public class NewProductRequestDTO {
    public String description;
    public String image;
    public Double quantityAtCost;
    public Date dateAvailableOn;
    public List<String> categoryList;
    public Boolean isDiscontinued;
    public Double storeQuantity;
    public Double msrp;
    public Date mapStartDate;
    public Date mapEndDate;
    public Date priceStartDate;
    public Date priceEndDate;
    public Double price;
    public Double currentPrice;
    public Date saleStartDate;
    public Date saleEndDate;
    public Long salePercentOff;
}
