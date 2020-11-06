package com.xiaocai.designs.single;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 1 -饿汉式 1 ---静态变量
 * @author: 张小菜
 * @date: 2020/10/18 21:10
 * @version: v1.0
 */
public class SingletonDemo01 {

    //TODO 1、构造器私有化
    private SingletonDemo01(){

    }
    //TODO 2、创建静态变量实例
    private  final  static SingletonDemo01 instance = new SingletonDemo01();

    //TODO 3、提供公有静态方法返回实例对象
    public static SingletonDemo01 getInstance(){
        return instance ;
    }





    public static void main(String[] args) {
        System.out.println("饿汉式1--静态常量----可用");
        SingletonDemo01 instance01 = SingletonDemo01.getInstance();
        SingletonDemo01 instance02 = SingletonDemo01.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());

    }
}

