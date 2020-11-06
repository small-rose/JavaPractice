package com.xiaocai.reflection;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 类加载过程笔记（参考狂神https://www.bilibili.com/video/BV1p4411P7V3?p=9）
 *  类加载过程
 *  1.加载
 *   --- 将字节码文件加载到内存，并将静态数据转换成方法区的运行时数据结构，然后在堆中生成一个代表这个类的 java.lang.Class 模板对象
 *  2、链接
 *   --- 将 Java 类的二进制代码合并到 JVM 的运行状态中的过程
 *      （1）验证：确保加载的类信息符合 JVM 规范，安全验证 魔数-版本信息-之类
 *      （2）准备： 正式为类的静态变量分配内存并设置类变量的默认初始化值，这些都在方法区中进行分配
 *      （3）解析； 虚拟机常量池内的符号引用（常量名）替换为直接引用地址的过程。
 *  3、初始化
 *   --- 执行类构造器 <clinit>() 方法的过程。类构造器 <clinit>() 方法是由编译期自动收集类中所有类变量的赋值动作和静态代码块中的语句合并执行产生。
 *       注意：--- 类构造器 是构造类信息的，不是实例化对象的。
 *       初始化类的时候，如果发现父类没有初始化，先触发父类的初始化。
 *       虚拟机保证类的 构造器 <clinit>() 方法在多线程环境中正确的加锁和同步。
 * @author: 张小菜
 * @date: 2020/10/23 19:43
 * @version: v1.0
 */
public class ReflectionTest03 {

    public static void main(String[] args) {

        Test t = new Test();
        System.out.println(t.m);
    }
}

class Test{
    static {
        System.out.println("Test类静态代码块初始化");
        m = 300 ;
    }
    static int m = 100;

    public Test(){
        System.out.println("Test类无参构造初始化");
    }
}