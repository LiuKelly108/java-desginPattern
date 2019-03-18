package com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.LoginAdapter;

public class LoginForQQAdapter implements LoginAdapter {


    @Override
    public boolean support(Object adapter) {
        return  adapter instanceof LoginForQQAdapter ;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
