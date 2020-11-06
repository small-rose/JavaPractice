package com.xiaocai.juc.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO 功能角色说明：ReentrantLock 的 Condition 绑定条件
 * TODO 描述： 多线程依次调用示例
 *  A线程执行 --->  B线程---> C线程---> D线程--->
 * @author: 张小菜
 * @date: 2020/10/21 23:41
 * @version: v1.0
 */
public class ConditionDemo {

    public static void main(String[] args) {
        ShareResouce shareResouce = new ShareResouce();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                shareResouce.printA();
            }
        },"线程A呀").start();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                shareResouce.printB();
            }
        },"线程B呀").start();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                shareResouce.printC();
            }
        },"线程C呀").start();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                shareResouce.printD();
            }
        },"线程D呀").start();
    }
}

// 线程资源类
class ShareResouce{

    private volatile  int number = 1 ; // 1-A  2-B  3-C  4-D

    private final Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();
    private Condition c4 = lock.newCondition();

    public void printA(){
        lock.lock();
        try{
            //TODO 1.判断
            while (number!=1){
                c1.await(); //让第一个线程等待
            }

            //TODO 2.干活
            for (int i = 1; i <= 5; i++) {
                System.out.println(" 我是" +Thread.currentThread().getName() +"---打印 AAAA ,打印次数"+i);
            }

            //TODO 3.通知
            number = 2 ;
            c2.signal();// 精准通知

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printB(){
        lock.lock();
        try{
            //TODO 1.判断
            while (number!=2){
                c2.await(); //让第一个线程等待
            }

            //TODO 2.干活
            for (int i = 1; i <=10; i++) {
                System.out.println(" 我是" +Thread.currentThread().getName() +"---打印 BBBB ,打印次数"+i);
            }

            //TODO 3.通知
            number = 3 ;
            c3.signal();// 精准通知

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printC(){
        lock.lock();
        try{
            //TODO 1.判断
            while (number!=3){
                c3.await(); //让第一个线程等待
            }

            //TODO 2.干活
            for (int i = 1; i <=15; i++) {
                System.out.println(" 我是" +Thread.currentThread().getName() +"---打印 CCCC ,打印次数"+i);
            }

            //TODO 3.通知
            number = 4 ;
            c4.signal();// 精准通知

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printD(){
        lock.lock();
        try{
            //TODO 1.判断
            while (number!=4){
                c4.await(); //让第一个线程等待
            }

            //TODO 2.干活
            for (int i = 1; i <= 4; i++) {
                System.out.println(" 我是" +Thread.currentThread().getName() +"---打印 DDDD ,打印次数"+i);
            }

            //TODO 3.通知
            number = 1 ;
            c1.signal();// 精准通知

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}