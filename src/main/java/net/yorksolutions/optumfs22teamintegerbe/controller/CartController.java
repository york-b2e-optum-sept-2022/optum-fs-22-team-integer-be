package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.dto.NewCartRequestDTO;
import net.yorksolutions.optumfs22teamintegerbe.dto.NewProductRequestDTO;
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
    public Cart create(@RequestBody NewCartRequestDTO cartRequestDTO) {
        return this.cartService.create(cartRequestDTO);
    }

    @GetMapping("/{cartId}")
    public Cart getCartList(Long cartId) {
        return this.cartService.getCart(cartId);
    }

}
