package com.kellystudy.pattern.proxy.staticproxy.recharge;

/**
 * 充值的业务接口
 */
public interface IRechargeService {

    //手机充值
    void  rechargeCellPhone() ;

    //游戏充值
    void rechargeGames();

}
