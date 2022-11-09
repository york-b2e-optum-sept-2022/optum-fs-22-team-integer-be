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

    public Cart create(Cart cart) {
//        System.out.println(dto.productList);
//        System.out.println(dto.totalPrice);
//        return this.cartRepository.save(
//                new Cart(dto.productList, dto.totalPrice));
        return cartRepository.save(cart);
    }

    public Cart getCart(Long cartId) {
        return (this.cartRepository.findById(cartId)).get();
    }

    public Cart update(Cart cart) {
        return cartRepository.save(cart);
    }
}
