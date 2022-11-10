package net.yorksolutions.optumfs22teamintegerbe.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class UpdateProductRequestDTO {
    public Long id;
    public String description;
    public String image;
    public Double quantityAtCost;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date dateAvailableOn;
    public List<String> categoryList;
    public Boolean isDiscontinued;
    public Double storeQuantity;
    public Double msrp;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date mapStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date mapEndDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date priceStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date priceEndDate;
    public Double price;
    public Double currentPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date saleStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public Date saleEndDate;
    public Double salePercentOff;
}
