package com.kellystudy.pattern.strategy.promstrategy;

/**
 *优惠券的促销策略
 */
public class CouponPromotion implements IPromotion {
    @Override
    public void doPromotion() {
        System.out.println("优惠券的促销策略，一张券抵50");
    }
}
