package net.yorksolutions.optumfs22teamintegerbe.repository;

import net.yorksolutions.optumfs22teamintegerbe.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {}
