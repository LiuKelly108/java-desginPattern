package com.kellystudy.pattern.strategy;

import com.kellystudy.pattern.strategy.promstrategy.IPromotion;

/**
 * 优惠活动
 */
public class PromotionActivity {

    private IPromotion   promotion ;

    public PromotionActivity(IPromotion promotion) {
        this.promotion = promotion;
    }
// 执行优惠活动
   public void  execute(){
        promotion.doPromotion();
   }

}
