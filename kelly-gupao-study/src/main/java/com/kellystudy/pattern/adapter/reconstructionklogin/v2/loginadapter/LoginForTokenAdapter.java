package com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.LoginAdapter;

public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
