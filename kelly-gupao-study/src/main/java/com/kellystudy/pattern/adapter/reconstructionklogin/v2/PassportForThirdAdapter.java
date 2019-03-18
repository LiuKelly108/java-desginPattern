package com.kellystudy.pattern.adapter.reconstructionklogin.v2;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;
import com.kellystudy.pattern.adapter.reconstructionklogin.old.SiginService;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter.LoginForQQAdapter;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter.LoginForSinaAdapter;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter.LoginForTelAdapter;
import com.kellystudy.pattern.adapter.reconstructionklogin.v2.loginadapter.LoginForTokenAdapter;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird{

    private ResultMsg processLogin(String id, Class<? extends LoginAdapter>  clazz) {
        try {
            LoginAdapter  adapter =clazz.newInstance() ;
            if(adapter.support(adapter)){
                return  adapter.login(id,adapter);
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null ;
    }


    @Override
    public ResultMsg loginForQQ(String id) {
        return  processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForSina(String id) {
        return  processLogin(id, LoginForSinaAdapter.class);
    }

    @Override
    public ResultMsg loginForTel(String telno) {
        return  processLogin(telno, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return  processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }
}
