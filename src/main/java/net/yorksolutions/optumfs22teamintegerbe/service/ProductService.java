package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.dto.NewProductRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.dto.UpdateProductRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Product;
import net.yorksolutions.optumfs22teamintegerbe.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

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

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Product update(UpdateProductRequestDTO dto) {
        Product updatedProduct =  new Product(
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
                dto.salePercentOff);

        updatedProduct.setId(dto.id);

        return this.productRepository.save(updatedProduct);
    }

    public void delete(Long productId) {
            productRepository.deleteById(productId);
    }

    public Iterable<Product> addCreateList(List<NewProductRequestDTO> productList) {
        //loop
        for(NewProductRequestDTO dto : productList){
            this.productRepository.save(
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
                            dto.salePercentOff)   );
        }
        Iterator productIterable = productList.stream().iterator();
        return convertIterableFromIterator(productIterable);
    }

    private Iterable<Product> convertIterableFromIterator(Iterator iterator) {
        return new Iterable() {
            // Overriding an abstract method iterator()
            public Iterator iterator() {
                return iterator;
            }
        };
    }

}
