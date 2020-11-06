package com.xiaocai.designs.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 6 - 懒汉式 4 --- 双重检测锁----
 * @author: 张小菜
 * @date: 2020/10/18 21:10
 * @version: v1.0
 */
public class SingletonDemo06 {

    //TODO 1、构造器私有化
    private SingletonDemo06(){

    }
    //TODO 2、创建静态变量实例 使用 volatile 关键字，保证单例的原子操作
    private  static  volatile SingletonDemo06 instance ;


    //TODO 3、提供公有静态方法返回实例对象 ----  synchronized
    public static SingletonDemo06 getInstance(){

        if(instance == null){

            synchronized(SingletonDemo06.class){
                if (instance == null){
                    instance = new SingletonDemo06();
                }
            }
        }
        return instance ;
    }



    public static void main(String[] args) {
        System.out.println("懒汉式4--双重检测锁----正常测试---");
        SingletonDemo06 instance01 = SingletonDemo06.getInstance();
        SingletonDemo06 instance02 = SingletonDemo06.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());


        try {
            System.out.println("懒汉式4--双重检测锁----反射测试，破坏单例模式---");
            Constructor<SingletonDemo06> constructor = SingletonDemo06.class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            SingletonDemo06 singletonDemo06A = constructor.newInstance();
            SingletonDemo06 singletonDemo06B = constructor.newInstance();

            System.out.println("使用反射实例化 " + singletonDemo06A.equals(singletonDemo06B));
            System.out.println("singletonDemo06A " + singletonDemo06A.hashCode());
            System.out.println("使用反射实例化singletonDemo02 " + singletonDemo06B.hashCode());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
