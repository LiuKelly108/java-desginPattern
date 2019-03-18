package com.kellystudy.pattern.adapter.reconstructionklogin.v2;

import com.kellystudy.pattern.adapter.reconstructionklogin.ResultMsg;

/**
 * 创建一个适配器接口
 */
public interface LoginAdapter {

    //是否支持adapter适配器
    boolean support(Object  adapter) ;
    //登录
    ResultMsg login(String id ,Object adapter) ;
}
