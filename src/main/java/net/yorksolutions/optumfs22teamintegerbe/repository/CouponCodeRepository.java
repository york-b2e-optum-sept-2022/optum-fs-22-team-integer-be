package net.yorksolutions.optumfs22teamintegerbe.repository;

import net.yorksolutions.optumfs22teamintegerbe.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponCodeRepository extends CrudRepository<Category, Long> {
}
