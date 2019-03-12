一、handwirte 为自己手写实现一个动态代理。步骤如下：
1、手动写KYProxy,创建一个新的实例
（1）手动生成一个$Proxy0.java，该类应当实现所传递的参数（接口），并且重写接口中的所有的方法，并反射调用接口的方法
（2）将生成的类写入到磁盘中
（3）将类编译成.class文件
（4）把编译的.class文件加载到JVM中
（5）返回字节码重组后的代理对象
2、KYClassLoader
将KYProxy生成的$Proxy0.java的class文件，加载到jvm中
3.KYInvocation
4.创建代理类KYJDKMeipo,使其 implements KYInvocation，使用KYProxy创建新类
二、为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？
JVM规范：类或接口的直接超接口的数量受类文件结构的interfaces_count项的大小(§4.1)的限制，为65535。
