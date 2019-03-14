package com.kellystudy.pattern.strategy;

import com.kellystudy.pattern.strategy.promstrategy.*;

public class PromotionTest {

    public static void main(String[] args) {

        String promotionkey="COUPON";
        PromotionActivity   promotionActivity = null ;

        promotionActivity = new PromotionActivity(PromotionFactory
                .promotionMap.get(promotionkey));

//        if("COUPON".equals(promotionkey)){
//          promotionActivity =new PromotionActivity(new CouponPromotion());
//        }else if("GROUP".equals(promotionkey)){
//            promotionActivity =new PromotionActivity(new GroupPromotion());
//        }else if("CashBack".equals(promotionkey)){
//            promotionActivity = new PromotionActivity(new CashBackPromotion());
//        }else{
//            promotionActivity = new PromotionActivity(new EmptyPromotion());
//        }
        promotionActivity.execute();
    }
}
