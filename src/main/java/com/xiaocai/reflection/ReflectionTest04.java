package com.xiaocai.reflection;

/**
 * @description: TODO 功能角色说明： 测试类声明时候初始化
 *
 * TODO 描述： 类的初始化分析（参考狂神https://www.bilibili.com/video/BV1p4411P7V3?p=10）
 *    什么时候会发送类初始化？
 *    （1）类的主动引用（一定会发生类的初始化）
 *        -1- 当虚拟机启动，先初始化 main 方法所在的类。
 *        -2- new 一个类的对象实例。
 *        -3- 调用类的静态成员（除了finnal常用）和静态方法。
 *        -4- 使用 java.lang.reflect 包的方法对类进行反射调用。
 *        -5- 初始化一个类，必须先初始化父类。
 *        ---------
 *    （2）类的被动引用（不会发生类的初始化）
 *          -- 访问静态域，只有真正声明这个域的类才会被初始化：如通过子类引用父类的静态变量，不会导致子类初始化。
 *          -- 通过数组定义类的引用，不会触发此类的初始化。
 *          -- 引用常量不会触发此类的初始化。（常量在链接截断就存入调用类的常量池了）
 *
 * @author: 张小菜
 * @date: 2020/10/23 19:58
 * @version: v1.0
 */
public class ReflectionTest04 {

    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 主动引用
        //Son son = new Son();

        // 反射
        //Class<?> aClass = Class.forName("com.xiaocai.reflection.Son");


        // todo  不加载
        //System.out.println(Son.b); //子类不会加载


        //Son[] array = new Son[2]; //只是命名


        System.out.println(Son.H); //子类不会加载

    }

}

class Father {
    static int b = 2 ;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300 ;
    }
    static  int m = 100;
    static  final int  H = 1 ;
}