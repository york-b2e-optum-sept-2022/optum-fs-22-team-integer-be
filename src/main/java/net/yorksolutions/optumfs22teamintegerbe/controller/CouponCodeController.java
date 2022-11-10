package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.entity.CouponCode;
import net.yorksolutions.optumfs22teamintegerbe.service.CouponCodeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/couponcode")
@CrossOrigin
public class CouponCodeController {

    CouponCodeService couponCodeService;

    public CouponCodeController(CouponCodeService couponCodeService) {
        this.couponCodeService = couponCodeService;
    }

    @PostMapping
    public CouponCode createCouponCode(@RequestBody CouponCode couponCode) {
        return this.couponCodeService.create(couponCode);
    }

    @PutMapping
    public CouponCode updateCouponCode(@RequestBody CouponCode couponCode) {
        return this.couponCodeService.update(couponCode);
    }

    @GetMapping
    public Iterable<CouponCode> getAllCouponCodes() { return this.couponCodeService.getAllCouponCodes();}

    @DeleteMapping("/{id}")
    public void deleteCouponCode(@PathVariable Long id) {
        this.couponCodeService.delete(id);
    }

}
