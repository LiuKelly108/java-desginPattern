package com.kellystudy.pattern.proxy.dynamic.handwirte;

import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 */
public interface KYInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
