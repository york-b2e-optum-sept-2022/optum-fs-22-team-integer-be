package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.dto.NewCartRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.entity.Cart;
import net.yorksolutions.optumfs22teamintegerbe.repository.CartRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CartService {
    CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart create(Cart cart) {
            Boolean isExistingCart = this.cartRepository.existsById(cart.getAccountId());
            if (isExistingCart) {
                throw new ResponseStatusException(HttpStatus.CONFLICT);
            }
            return this.cartRepository.save(cart);
        }


    public Cart getCart(Long cartId) {
        return (this.cartRepository.findById(cartId)).get();
    }

    public Cart update(Cart cart) {
        return cartRepository.save(cart);
    }
}
