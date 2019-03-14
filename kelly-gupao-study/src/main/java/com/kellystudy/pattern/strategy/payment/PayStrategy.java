package com.kellystudy.pattern.strategy.payment;

import com.kellystudy.pattern.strategy.payment.paystrategy.Alipay;
import com.kellystudy.pattern.strategy.payment.paystrategy.Payment;
import com.kellystudy.pattern.strategy.payment.paystrategy.Unionpay;
import com.kellystudy.pattern.strategy.payment.paystrategy.WeChatpay;

/**
 * 创建支付策略管理类
 */
public enum PayStrategy {

    ALIPAY ("alipay", new Alipay()),
    WECHAT("wechat" ,new WeChatpay()),
    UNION("union",new Unionpay());


    private String pay_key ;
    private Payment payment ;

    PayStrategy(String pay_key, Payment payment) {
        this.pay_key = pay_key;
        this.payment = payment;
    }

    public String getPay_key() {
        return pay_key;
    }


    public Payment getPayment() {
       return payment ;
    }
//---------------------根据key获得枚举的当前对象------------
    public static PayStrategy  getPayMentByKey(String key){
        if(null == key ){
           return null ;
        }
        //PayStrategy.values() 获得所有的常量  PayStrategy[]
        for(PayStrategy ps: PayStrategy.values()){
            if(ps.getPay_key().equals(key)){
                return ps ;
            }
        }
          return  null ;
    }

}
