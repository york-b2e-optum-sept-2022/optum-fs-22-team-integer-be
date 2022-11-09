package net.yorksolutions.optumfs22teamintegerbe.repository;

import net.yorksolutions.optumfs22teamintegerbe.entity.ProductList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepository extends CrudRepository<ProductList, Long> {
}
