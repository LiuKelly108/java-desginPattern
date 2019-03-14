package com.kellystudy.pattern.strategy;

import com.kellystudy.pattern.strategy.promstrategy.*;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {

    //存放优惠活动
    public static Map<String, IPromotion> promotionMap =new HashMap<String,IPromotion>();

    static{
         promotionMap.put(PromotionKey.PRO_COUPON,new CouponPromotion());
         promotionMap.put(PromotionKey.PRO_GROUP, new GroupPromotion());
         promotionMap.put(PromotionKey.PRO_CASHBACK,new CashBackPromotion());
        promotionMap.put(PromotionKey.NON_PROMOTION,new EmptyPromotion());//无优惠
    }
    public  IPromotion default_promotion = promotionMap.get(PromotionKey.NON_PROMOTION);

    //获得促销策略的具体对象
    public static IPromotion getPromotion(String key){
      return promotionMap.containsKey(key)? promotionMap.get(key) : promotionMap.get(PromotionKey.PRO_DEFAULT);
    }

    public  interface  PromotionKey{

         String PRO_COUPON ="COUPON";
         String PRO_GROUP ="GROUP";
         String PRO_CASHBACK ="CASHBACK";
         String PRO_DEFAULT="DEFAULT";
         String NON_PROMOTION="NOPROMOTION";
    }
}
