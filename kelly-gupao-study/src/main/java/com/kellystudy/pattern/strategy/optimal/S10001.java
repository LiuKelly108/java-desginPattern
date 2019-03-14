package com.kellystudy.pattern.strategy.optimal;

import javax.naming.Context;

/**
 * 业务接口实现IServer
 */
public class S10001 implements IServer {
    @Override
    public void execute(Context context) throws Exception {
        System.out.println("----实现接口方法----");
    }
}
