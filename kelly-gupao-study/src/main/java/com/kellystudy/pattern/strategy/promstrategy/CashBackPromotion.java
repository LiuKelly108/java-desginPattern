package com.kellystudy.pattern.strategy.promstrategy;

/**
 * 返现的促销策略
 */
public class CashBackPromotion implements IPromotion {
    @Override
    public void doPromotion() {
        System.out.println("返现促销策略：买一返现30块了");
    }
}
