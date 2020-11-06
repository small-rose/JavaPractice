package com.xiaocai.reflection;

/**
 * @description: TODO 功能角色说明： 反射获取类的方式
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/23 18:37
 * @version: v1.0
 */
public class ReflectionTest01 {

    public static void main(String[] args) {

        Person person = new Student();
        System.out.println(" 这个人是："+person.name);
        System.out.println("-----方式1:");
        //TODO 方式一 : 通过对象获取 Class类
        Class clazz1 = person.getClass();
        System.out.println(clazz1);
        System.out.println(clazz1.hashCode());


        //TODO 方式二 : forName 方法
        System.out.println("-----方式2:");
        try {
            Class clazz2 = Class.forName("com.xiaocai.reflection.Person");
            System.out.println(clazz2);
            System.out.println(clazz2.hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //TODO 方式三 : 类名.class 获取
        Class clazz3 = Person.class ;
        System.out.println(clazz3);
        System.out.println(clazz3.hashCode());

        //TODO 方式四 : 基本类型内置类型的包装类有一个 Type 属性
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        //TODO  获得父类类型
        Class clazz5 = clazz1.getSuperclass();
        System.out.println(clazz5);


    }

}

class Person{

    String name ;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
}


class Student extends Person{

    public Student(){
        this.name = name;
    }
}

class Teacher extends Person{

    public Teacher(){
        this.name = name;
    }
}