package com.kellystudy.pattern.proxy.staticproxy.recharge;

/**
 * 代理要实现客户的需求，因此要implements IConsumer
 */
public class RechargeStaticProxy implements IConsumer{

    private IRechargeService rechargeService ;

    public RechargeStaticProxy(IRechargeService rechargeService) {
        this.rechargeService = rechargeService;
    }

    public void rechargeCellPhone() {
        //给用户充值缴费前的操作
        beforeRecharge();
        //缴费操作
        rechargeService.rechargeCellPhone();
        //缴费后的操作
        afterRecharge();
    }

    public void rechargeGames() {
        //给用户充值缴费前的操作
        beforeRecharge();
        //缴费操作
        rechargeService.rechargeGames();
        //缴费后的操作
        afterRecharge();
    }

    private void beforeRecharge(){
         System.out.println("缴费前：查询用户是否把钱缴纳给代理中心");
     }

     private void afterRecharge(){
         System.out.println("缴费成功后：短信通知用户已经缴费完成");
     }
}
