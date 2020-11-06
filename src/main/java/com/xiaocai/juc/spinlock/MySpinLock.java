package com.xiaocai.juc.spinlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @description: TODO 功能角色说明： 利用 CAS 手写自旋锁
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 22:55
 * @version: v1.0
 */
public class MySpinLock {

    // TODO 原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){

        Thread thread = Thread.currentThread();

        while (!atomicReference.compareAndSet(null,thread)){
            // 第一个线程占着，其他线程进来只能自旋
        }
        System.out.println(Thread.currentThread().getName()+"\t"+ " invoked lock ");
    }

    public void myUnLock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println(Thread.currentThread().getName()+"\t"+ " invoked unlock ");

    }

    public static void main(String[] args) {

        MySpinLock mySpinLock = new MySpinLock();

        new Thread(()->{
            mySpinLock.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mySpinLock.myUnLock();
        },"AAA").start();


        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new Thread(()->{
            mySpinLock.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mySpinLock.myUnLock();
        },"BBB").start();


    }
}
