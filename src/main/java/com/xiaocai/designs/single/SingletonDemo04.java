package com.xiaocai.designs.single;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 4 - 懒汉式 2 --- 线程安全写法 -- synchronized 同步方法
 * @author: 张小菜
 * @date: 2020/10/18 21:10
 * @version: v1.0
 */
public class SingletonDemo04 {

    //TODO 1、构造器私有化
    private SingletonDemo04(){

    }
    //TODO 2、创建静态变量实例
    private   static SingletonDemo04 instance ;


    //TODO 3、提供公有静态方法返回实例对象 ----使用时才创建对象,并且使用  synchronized 同步方法，解决线程安全问题
    public static synchronized SingletonDemo04 getInstance(){
        if(instance == null){
            instance = new SingletonDemo04();
        }
        return instance ;
    }

    public static void main(String[] args) {
        System.out.println("懒汉式2--线程安全式写法----");
        SingletonDemo04 instance01 = SingletonDemo04.getInstance();
        SingletonDemo04 instance02 = SingletonDemo04.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());
    }
}
