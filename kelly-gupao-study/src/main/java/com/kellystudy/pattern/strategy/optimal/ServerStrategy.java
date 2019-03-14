package com.kellystudy.pattern.strategy.optimal;

import java.util.HashMap;
import java.util.Map;

public class ServerStrategy {

    public static  Map<String ,IServer> serverMap =new HashMap<String,IServer>();

    static {
        serverMap.put(ServerID.S10001, new S10001());
//        serverMap.put(ServerID.S10004, new S10004());
//        serverMap.put(ServerID.S10009, new S10009());
//        serverMap.put(ServerID.S10038, new S10038());
//        serverMap.put(ServerID.S10040, new S10040());
//        serverMap.put(ServerID.S10090, new S10090());

    }


    private interface  ServerID{

        String S10001 = "S0001" ;
        String S10004 = "S0013" ;
        String S10009 = "S0009" ;
        String S10038 = "S0038" ;
        String S10040 = "S0040" ;
        String S10090 = "S0041" ;
    }

}

