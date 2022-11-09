package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.entity.CouponCode;
import net.yorksolutions.optumfs22teamintegerbe.repository.CouponCodeRepository;
import org.springframework.stereotype.Service;

@Service
public class CouponCodeService {

    CouponCodeRepository couponCodeRepository;

    public CouponCodeService(CouponCodeRepository couponCodeRepository) {
        this.couponCodeRepository = couponCodeRepository;
    }

    public CouponCode create(CouponCode couponCode) {
        return couponCodeRepository.save(couponCode);
    }

    public CouponCode update(CouponCode couponCode) {
        return couponCodeRepository.save(couponCode);
    }

    public Iterable<CouponCode> getAllCouponCodes() {
        return couponCodeRepository.findAll();
    }
}
