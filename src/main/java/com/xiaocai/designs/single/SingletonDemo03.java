package com.xiaocai.designs.single;

import java.util.concurrent.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 单例模式 3 - 懒汉式 1 --- 线程不安全写法
 * @author: 张小菜
 * @date: 2020/10/18 21:10
 * @version: v1.0
 */
public class SingletonDemo03 {

    //TODO 1、构造器私有化
    private SingletonDemo03(){

    }
    //TODO 2、创建静态变量实例
    private   static SingletonDemo03 instance ;


    //TODO 3、提供公有静态方法返回实例对象 ----使用时才创建对象
    public static SingletonDemo03 getInstance(){
        if(instance == null){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonDemo03();
        }
        return instance ;
    }



    public static void main(String[] args) {
        System.out.println("懒汉式1--线程不安全式写法----");
        /*
        SingletonDemo03 instance01 = SingletonDemo03.getInstance();
        SingletonDemo03 instance02 = SingletonDemo03.getInstance();
        System.out.println(instance01.equals(instance02));
        System.out.println(instance01.hashCode());
        System.out.println(instance01.hashCode());
*/
        /*
        Callable<SingletonDemo03> callable = new Callable<SingletonDemo03>() {
            @Override
            public SingletonDemo03 call() throws Exception {
                return SingletonDemo03.getInstance();
            }
        };
        */

        Callable<SingletonDemo03> callable = () -> SingletonDemo03.getInstance();

        ExecutorService service1 = Executors.newFixedThreadPool(2);

        Future<SingletonDemo03> future1 = service1.submit(callable);
        Future<SingletonDemo03> future2 = service1.submit(callable);

        try {
            SingletonDemo03 singletonDemo03_t1 = future1.get();
            SingletonDemo03 singletonDemo03_t2 = future2.get();

            System.out.println(singletonDemo03_t1.equals(singletonDemo03_t2));
            System.out.println(singletonDemo03_t1.hashCode());
            System.out.println(singletonDemo03_t2.hashCode());


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            service1.shutdown();
        }
    }
}
