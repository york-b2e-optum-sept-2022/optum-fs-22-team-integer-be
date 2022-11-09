package net.yorksolutions.optumfs22teamintegerbe.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import net.yorksolutions.optumfs22teamintegerbe.entity.ProductList;

import java.util.Set;

public class NewCartRequestDTO {
    @JsonFormat
    public Set<ProductList> productList;
    public Double totalPrice;
}
