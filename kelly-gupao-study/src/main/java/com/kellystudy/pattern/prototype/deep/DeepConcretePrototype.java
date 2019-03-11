package com.kellystudy.pattern.prototype.deep;

import com.kellystudy.pattern.prototype.shallow.ProtoType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 深克隆：原型对象的引用的克隆，创建了一个新的引用，同时将对应原型中引用的值复制到新引用的值中
 */
public class DeepConcretePrototype implements ProtoType , Serializable {

    private static final long serialVersionUID = 1853617305917029772L;

    private String name ;
    private  int  age ;
    private List<String> hobbies = new ArrayList<String>();

    public DeepConcretePrototype(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    // 深克隆
    public DeepConcretePrototype clone() {
        try {
            byte[] data = serializeObject();
            DeepConcretePrototype obj = (DeepConcretePrototype)  deSerializeObject(data);
            return  obj ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null ;
    }


    //序列化当前的对象
    private byte[] serializeObject() throws IOException {

        ByteArrayOutputStream bos = null ;
        ObjectOutputStream  oos = null ;
        byte []data =null ;
        try{
            bos=new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            data = bos.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bos!=null){
                bos.close();
            }
            if(oos!=null){
                oos.close();
            }
        }
         return data ;
    }

    //反序列化当前字节流
    private  Object deSerializeObject(byte[]  data) throws IOException {
        ByteArrayInputStream bis= null;
        ObjectInputStream  ois = null ;
        Object obj = null;
        try{
            bis = new ByteArrayInputStream(data);
            ois=new ObjectInputStream(bis);
           obj = ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bis!=null){
                bis.close();
            }
            if(ois!=null){
                ois.close();
            }
        }
         return obj ;
    }
}
