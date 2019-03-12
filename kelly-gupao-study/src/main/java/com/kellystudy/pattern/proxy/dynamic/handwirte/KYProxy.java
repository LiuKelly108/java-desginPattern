package com.kellystudy.pattern.proxy.dynamic.handwirte;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 创建代理类
 */
public class KYProxy implements Serializable {


    private static final long serialVersionUID = -2425082093870187795L;

    private static final String  ln ="\r\n" ;

    public static Object newProxyInstance(KYClassLoader loader, Class<?>[] interfaces, KYInvocationHandler h)
            throws Exception{

          //1、动态生成原代码文件
        String src = generateSrc(interfaces[0]);
        //2、java文件输出到磁盘
        String filePath = KYProxy.class.getResource("").getPath();
        System.out.println(filePath);
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();
       //3、、把生成的.java 文件编译成.class 文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manage.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task =
        compiler.getTask(null,manage,null,null,null,iterable);
        task.call();
        manage.close();
        //4、、编译生成的.class 文件加载到JVM 中来
        Class proxyClass =  loader.findClass("$Proxy0");
        Constructor c = proxyClass.getConstructor(KYInvocationHandler.class);
        f.delete();
        //5、返回字节码重组以后的新的代理对象
        return c.newInstance(h);
    }

    //动态生成实现接口方法的字节码
    private static String generateSrc(Class<?> interfaces){
        StringBuffer sb = new StringBuffer();
        //导入的包
        sb.append("package com.kellystudy.pattern.proxy.dynamic.handwirte;"+ln);
        sb.append("import com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker.Person;"+ln);
        sb.append("import com.kellystudy.pattern.proxy.dynamic.handwirte.KYInvocationHandler;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        //开始写类
        sb.append("public class $Proxy0 implements "+interfaces.getName()+"{"+ln);
        //定义成员变量
        sb.append("KYInvocationHandler kyh ;"+ln);
        //定义构造方法
        sb.append("public $Proxy0(KYInvocationHandler kyh){"+ln);
        sb.append("this.kyh=kyh ;"+ln);
        sb.append("}"+ln);
        //方法
        //（1）获得接口内的所有方法
        Method[] method = interfaces.getMethods();
        for(Method m:method){
            sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"(){"+ln);
            sb.append("try{"+ln);
               sb.append("Method m ="+interfaces.getName()+".class.getMethod(\""+m.getName()+"\", new Class<?>[]{}) ;" +ln);
               sb.append("this.kyh.invoke(this,m,null);"+ln);
            sb.append("}catch(Throwable e){"+ln);
            sb.append("e.printStackTrace();"+ln);
            sb.append("}"+ln) ;
            sb.append("}"+ln);
        }

        sb.append("}"+ln);



        return  sb.toString();
    }
}
