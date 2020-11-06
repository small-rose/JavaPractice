package com.xiaocai.reflection;

/**
 * @description: TODO 功能角色说明： 获取类信息
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/23 20:38
 * @version: v1.0
 */
public class ReflectionTest07 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c1 = Class.forName("com.xiaocai.reflection.Father");

        //获取包名 + 类名
        System.out.println("获取类名"+c1.getName());

        System.out.println("获取类名"+c1.getName());
        System.out.println("获取类名"+c1.getName());
        System.out.println("获取类名"+c1.getName());
        System.out.println("获取类名"+c1.getName());
        System.out.println("获取类名"+c1.getName());

        char[] data = {'a', 'b', 'c', 'd', 'e'};
        String s = String.copyValueOf(data, 0, 2);
    }
}
