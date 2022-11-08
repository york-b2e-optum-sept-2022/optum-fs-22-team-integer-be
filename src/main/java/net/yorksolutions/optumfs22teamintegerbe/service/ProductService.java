package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.dto.NewProductRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Product;
import net.yorksolutions.optumfs22teamintegerbe.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(NewProductRequestDTO dto) {

        return this.productRepository.save(
                new Product(
                        dto.description,
                        dto.image,
                        dto.quantityAtCost,
                        dto.dateAvailableOn,
                        dto.categoryList,
                        dto.isDiscontinued,
                        dto.storeQuantity,
                        dto.msrp,
                        dto.mapStartDate,
                        dto.mapEndDate,
                        dto.priceStartDate,
                        dto.priceEndDate,
                        dto.price,
                        dto.currentPrice,
                        dto.saleStartDate,
                        dto.saleEndDate,
                        dto.salePercentOff)
        );
    }
}
