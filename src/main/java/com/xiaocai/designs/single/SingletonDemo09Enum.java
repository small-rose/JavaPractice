package com.xiaocai.designs.single;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 9 - 使用枚举 --推荐使用
 * @author: 张小菜
 * @date: 2020/10/18 22:13
 * @version: v1.0
 */
public enum SingletonDemo09Enum {

    INSTANCE ;

    public void sayOK(){
        System.out.println("hello world ");
    }


    public static void main(String[] args) {

        System.out.println("单例模式 9 --- 枚举类----正常测试（推荐使用）---");
        SingletonDemo09Enum instance01 = SingletonDemo09Enum.INSTANCE;
        SingletonDemo09Enum instance02 = SingletonDemo09Enum.INSTANCE;

        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());
    }
}
