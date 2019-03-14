package com.kellystudy.pattern.strategy.promstrategy;

/**
 * 无优惠策略
 */
public class EmptyPromotion implements IPromotion {
    @Override
    public void doPromotion() {
        System.out.println("对不起，您所在的时间无优惠策略");
    }
}
