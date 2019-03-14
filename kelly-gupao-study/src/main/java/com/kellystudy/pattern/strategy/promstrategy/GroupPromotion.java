package com.kellystudy.pattern.strategy.promstrategy;

/**
 * 团购的优惠策略
 */
public class GroupPromotion implements IPromotion {
    @Override
    public void doPromotion() {
        System.out.println("团购优惠，30人拼团，团内成员均可享受折扣500块");
    }
}
