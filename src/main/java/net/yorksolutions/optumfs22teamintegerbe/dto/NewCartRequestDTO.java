package net.yorksolutions.optumfs22teamintegerbe.dto;

import net.yorksolutions.optumfs22teamintegerbe.entity.ProductList;

import java.util.Set;

public class NewCartRequestDTO {
    public Set<ProductList> productList;
    public Double totalPrice;
}
