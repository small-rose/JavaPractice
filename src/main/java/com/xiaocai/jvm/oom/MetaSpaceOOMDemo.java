package com.xiaocai.jvm.oom;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 模拟 OutOfMemoryError: Java heap space 异常
 *      参数设置:  -XX:MetaspaceSize=4M -XX:MaxMetaspaceSize=4m -XX:+PrintGCDetails
 * @author: 张小菜
 * @date: 2020/11/4 17:20
 * @version: v1.0
 */
public class MetaSpaceOOMDemo {

    // 静态内部类
    static  class  MetaSpaceOOM{

    }

    public static void main(String[] args) {
        int i = 0 ;//计数器

        try {

            while (true){
                i++;

                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(MetaSpaceOOM.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o,args);
                    }
                } );
                // 创建模板
                enhancer.create();

            }

        } catch (Exception e) {
            System.out.println("----循环了 "+ i + " 次之后异常");
            e.printStackTrace();
        }
    }
}
