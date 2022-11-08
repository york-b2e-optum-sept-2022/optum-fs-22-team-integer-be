package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.dto.NewCartRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Cart;
import net.yorksolutions.optumfs22teamintegerbe.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart create(NewCartRequestDTO dto) {
        return this.cartRepository.save(
                new Cart(dto.productList, dto.totalPrice));
    }

    public Cart getCart(Long accountId) {
        return (this.cartRepository.findById(accountId)).get();
    }
}
