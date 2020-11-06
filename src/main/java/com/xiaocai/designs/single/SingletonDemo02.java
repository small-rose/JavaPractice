package com.xiaocai.designs.single;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 2 - 饿汉式 2 ---静态代码块写法
 * @author: 张小菜
 * @date: 2020/10/18 21:10
 * @version: v1.0
 */
public class SingletonDemo02 {

    //TODO 1、构造器私有化
    private SingletonDemo02(){

    }
    //TODO 2、创建静态变量实例
    private   static SingletonDemo02 instance ;

    //TODO 3、静态代码块中进行实例化
    static {
        instance = new SingletonDemo02();
    }


    //TODO 4、提供公有静态方法返回实例对象
    public static SingletonDemo02 getInstance(){

        return instance ;
    }



    public static void main(String[] args) {
        System.out.println("饿汉式2--静态代码块写法----可用");
        SingletonDemo02 instance01 = SingletonDemo02.getInstance();
        SingletonDemo02 instance02 = SingletonDemo02.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());
    }
}
