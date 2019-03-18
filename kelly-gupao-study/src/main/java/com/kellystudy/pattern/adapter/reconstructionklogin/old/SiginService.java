package com.kellystudy.pattern.adapter.reconstructionklogin.old;

import com.kellystudy.pattern.adapter.reconstructionklogin.Member;
import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;

public class SiginService {

    /**
     * 注册方法
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
