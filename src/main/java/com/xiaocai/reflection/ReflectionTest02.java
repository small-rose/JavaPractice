package com.xiaocai.reflection;

import java.lang.annotation.ElementType;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 哪些类可以有 Class 对象
 *  *   class 外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
 *  *   interface 接口
 *  *   [] 数字
 *  *   enum 枚举
 *  *   annotation  注解@interface
 *  *   primitive type 基本数据类型
 *  *   void
 * @author: 张小菜
 * @date: 2020/10/23 19:27
 * @version: v1.0
 */
public class ReflectionTest02 {

    public static void main(String[] args) {
        Class c1 = Object.class; //TODO   类
        Class c2 = Comparable.class; //TODO   接口
        Class c3 = String[].class; //TODO   一位数组
        Class c4 = int[][].class; //TODO   二维数组类、
        Class c5 = Override.class; //TODO   注解类类
        Class c6 = ElementType.class; //TODO   枚举类型
        Class c7 = Integer.class; //TODO   基本数据类型
        Class c8 = void.class; //TODO   void
        Class c9 = Class.class; //TODO   Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

    }
}
