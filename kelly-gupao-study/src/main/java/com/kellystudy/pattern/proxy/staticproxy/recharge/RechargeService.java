package com.kellystudy.pattern.proxy.staticproxy.recharge;

/**
 * 充值业务的具体实现
 */
public class RechargeService implements IRechargeService{

    public void rechargeCellPhone() {
        System.out.println("----充值中心给手机充值----");
    }

    public void rechargeGames() {
        System.out.println("-----充值中心给游戏充值----");
    }
}
