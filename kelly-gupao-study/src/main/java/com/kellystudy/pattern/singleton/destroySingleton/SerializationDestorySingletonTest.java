package com.kellystudy.pattern.singleton.destroySingleton;

import com.kellystudy.pattern.singleton.hungry.SerializableHungrySingleton;

import java.io.*;
import java.util.Arrays;

/**
 * 破坏单例：
 *  2、使用序列化 破快单例
 */
public class SerializationDestorySingletonTest {

    public static void main(String[] args) throws IOException {

       //1、正常方法获得单例
        SerializableHungrySingleton  shs =SerializableHungrySingleton.getInstance();
        System.out.println("SerializableHungrySingleton:"+shs);
        //2、序列化和反序列化 形式获得单例
        ByteArrayOutputStream baos=null ;
        ObjectOutputStream oos = null ;
        ByteArrayInputStream bais = null ;
        ObjectInputStream ois = null ;
        try {
            //序列化，是对象转换为可传输，可储存的物质
             baos =new ByteArrayOutputStream();
             oos = new ObjectOutputStream(baos);
             oos.writeObject(shs);

             byte[] data = baos.toByteArray();
           // System.out.println("-----序列化后的data:"+ Arrays.toString(data));

            //反序列化获得对象
             bais =new ByteArrayInputStream(data);
             ois =new ObjectInputStream(bais) ;
            SerializableHungrySingleton obj = (SerializableHungrySingleton) ois.readObject();
            System.out.println("序列化反序列化后的单例："+obj);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null != baos){
                baos.close();
            }
            if(null != oos){
                oos.close();
            }
           if(null != bais){
               bais.close();
           }
           if(null != ois ) {
               ois.close();
           }
        }


    }
}
