package com.xiaocai.designs.single;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 8 - 使用静态内部类模式 ---利用静态内部类的装载机制，使 JVM 来保证安全
 * @author: 张小菜
 * @date: 2020/10/18 22:13
 * @version: v1.0
 */
public class SingletonDemo08 {

    // 构造器私有
    private SingletonDemo08(){

    }

    // 公有方法获取
    public static  synchronized  SingletonDemo08 getInstance(){

        return SingleInstance.SINGLETON_INSTANCE;
    }

    private static  class SingleInstance{

        private static  final SingletonDemo08 SINGLETON_INSTANCE = new SingletonDemo08();
    }


    public static void main(String[] args) {
        System.out.println("单例模式 8 ---静态内部类----正常测试（推荐使用）---");
        SingletonDemo08 instance01 = SingletonDemo08.getInstance();
        SingletonDemo08 instance02 = SingletonDemo08.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());
    }
}
