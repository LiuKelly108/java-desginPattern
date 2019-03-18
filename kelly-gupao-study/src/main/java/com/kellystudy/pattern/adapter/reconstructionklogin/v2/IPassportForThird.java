package com.kellystudy.pattern.adapter.reconstructionklogin.v2;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;

/**
 * 第三方登录接口
 */
public interface IPassportForThird {

    // QQ登录
    ResultMsg  loginForQQ(String id);

    //新浪登录
    ResultMsg loginForSina(String id) ;

    //手机号登录
    ResultMsg loginForTel(String telno);

    //记住登录状态后，自动登录
    ResultMsg loginForToken(String token);

    //注册后自动登录
    ResultMsg loginForRegist(String username, String passport);

}
