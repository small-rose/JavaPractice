package com.xiaocai.designs.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 7 - 懒汉式 5 --- 双重检测锁的升级版---三重检测锁
 * @author: 张小菜
 * @date: 2020/10/18 21:10
 * @version: v1.0
 */
public class SingletonDemo07 {

    //  添加单例存活标记
    private static boolean xiaocai = false ;

    //TODO 1、构造器私有化，并使用
    private SingletonDemo07(){
        synchronized(SingletonDemo07.class){
            if (xiaocai == false){

                xiaocai = true ;
            }else{
                throw new RuntimeException("不要使用反射破坏单例");
            }
        }
    }

    //TODO 2、创建静态变量实例 使用 volatile 关键字，保证单例的原子操作
    private  static  volatile SingletonDemo07 instance ;


    //TODO 3、提供公有静态方法返回实例对象 ----  synchronized
    public static SingletonDemo07 getInstance(){

        if(instance == null){

            synchronized(SingletonDemo07.class){
                if (instance == null){
                    instance = new SingletonDemo07();
                    xiaocai = true ;
                }
            }
        }
        return instance ;
    }



    public static void main(String[] args) {
        System.out.println("懒汉式5--三重检测锁----正常测试（不优先使用）---");
        SingletonDemo07 instance01 = SingletonDemo07.getInstance();
        SingletonDemo07 instance02 = SingletonDemo07.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());


        try {
            System.out.println("懒汉式5--三重检测锁----反射测试，破坏单例模式---");
            // 将文件反编译，找到 单例存活标记
            Field xiaocai = SingletonDemo07.class.getDeclaredField("xiaocai");
            xiaocai.setAccessible(true);

            Constructor<SingletonDemo07> constructor = SingletonDemo07.class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            SingletonDemo07 singletonDemo06A = constructor.newInstance();
            SingletonDemo07 singletonDemo06B = constructor.newInstance();

            xiaocai.set(xiaocai, false);

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
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
