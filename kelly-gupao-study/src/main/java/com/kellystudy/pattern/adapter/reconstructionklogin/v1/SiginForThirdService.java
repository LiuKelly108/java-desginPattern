package com.kellystudy.pattern.adapter.reconstructionklogin.v1;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;
import com.kellystudy.pattern.adapter.reconstructionklogin.old.SiginService;

public class SiginForThirdService extends SiginService {

    /**
     * QQ登录
     * @param openId
     * @return
     */
    public ResultMsg loginForQQ(String openId){
        //1、openId 是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法
        return  loginForRegist(openId,null);
    }

    /**
     * 微信登录
     * @param openId
     * @return
     */
    public ResultMsg loginForWechat(String openId){
        return  loginForRegist(openId,null);
    }

    /**
     * 注册并登录
     * @param username
     * @param password
     * @return
     */
    private ResultMsg loginForRegist(String username, String password) {
        super.regist(username,password);
        return  super.login(username ,password);
    }

}
