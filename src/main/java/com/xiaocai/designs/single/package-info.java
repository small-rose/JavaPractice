package com.xiaocai.designs.single;
/*
TODO  在 设计层面 保证某个类只能存在一个对象实例
    单例模式 8 种写法
    ------
    饿汉式 2种
    ------
 1、饿汉式之----静态常量；   SingletonDemo01 【可以使用】
 2、饿汉式之----静态代码块   SingletonDemo02 【可以使用】
    ------
    ------
    懒汉式 2种
 3、懒汉式之----【非线程安全】  SingletonDemo03
        起到了LazyLoading 延迟加载的效果，只能在单线程下加载。
        多线程下，线程不安全。
        实际开发中不能使用。
 4、懒汉式之----【同步方法】  SingletonDemo04  ---- 同步代码块在多线程下也是线程不安全的。
        synchronized 同步方法 造成了效率低  SingletonDemo05
 5、懒汉式之----【双重检测锁】  SingletonDemo06
        解决延迟加载问题，解决线程安全问题，但是如果使用了反射，依旧可以破坏单例
 6、懒汉式之----【三重检测锁】  SingletonDemo07
        可以防止反射破坏单例【推荐使用】
 7、静态内部类式
        利用类装载机制保证初始化只有一个县城；
        类的静态属性只会在第一次加载的时候初始化，利用 JVM保证线程的安全性。在类进行初始化时，别的线程无法进入。
        避免线程不安全，实现了延迟加载，效率高。【推荐使用】
 8、枚举式单例
    从根源上保证单例【推荐使用】
    避免多线程问题，防止反序列化重新创建对象。



*/