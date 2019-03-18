package com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.LoginAdapter;

public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter ;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
