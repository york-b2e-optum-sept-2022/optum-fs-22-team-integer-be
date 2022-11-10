package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.entity.Cart;
import net.yorksolutions.optumfs22teamintegerbe.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
@CrossOrigin
public class CartController {
    CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {
        return this.cartService.create(cart);
    }

    @PutMapping
    public Cart updateCart(@RequestBody Cart cart) {
        return this.cartService.update(cart);
    }

    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable Long cartId) {
        return this.cartService.getCart(cartId);
    }

    @DeleteMapping("/delete/{cartId}")
    public void deleteCart(@PathVariable Long cartId) {
        this.cartService.delete(cartId);
    }


}
