package com.xiaocai.juc.rwlock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description: TODO 功能角色说明： 读写锁
 * TODO 描述： 读写锁练习--
 *  多线程读一个资源类，读取共享资源应该可以同时进行。但是有一个线程去写共享资源，就不应该再有其他线程对该资源进行读或写
 *  参考：阳哥视频
 *  总结：
 *    读-读----可以共享；
 *    读-写----不可以共享
 *    读-写----不可以共享
 *
 * @author: 张小菜
 * @date: 2020/10/21 23:08
 * @version: v1.0
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {

        MyCacheRWLock cacheRWLock = new MyCacheRWLock();
        for (int i = 1; i <=6 ; i++) {
            final  int tmpInt = i ;
            new Thread(()->{
                cacheRWLock.put(tmpInt+"",tmpInt+"");
            },String.valueOf("Thread-zxc-A-"+i)).start();
        }

        for (int i = 1; i <=6 ; i++) {
            final  int tmpInt = i ;
            new Thread(()->{
                cacheRWLock.get(tmpInt+"");
            },String.valueOf("Thread-zxc-B-"+i)).start();
        }

    }

    private static void noLockTest(){
        MyCacheNoLock myCache = new MyCacheNoLock();

        for (int i = 1; i <=6 ; i++) {
            final  int tmpInt = i ;
            new Thread(()->{
                myCache.put(tmpInt+"",tmpInt+"");
            },String.valueOf("Thread-zxc-A-"+i)).start();
        }

        for (int i = 1; i <=6 ; i++) {
            final  int tmpInt = i ;
            new Thread(()->{
                myCache.get(tmpInt+"");
            },String.valueOf("Thread-zxc-B-"+i)).start();
        }
    }
}
// 有锁示例
class MyCacheRWLock {

    private volatile Map<String,Object> map = new HashMap<>();

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String key, Object value){

        readWriteLock.writeLock().lock();
        try {
            System.out.println( Thread.currentThread().getName()+"正在写入缓存(有锁).... ");
            TimeUnit.MILLISECONDS.sleep(300);

            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+"写入缓存成功(有锁).... Key是："+key);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            readWriteLock.writeLock().unlock();
        }


    }

    public Object get(String key){
        Object object = null;
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在读取缓存(有锁).... Key是："+key);
            TimeUnit.MILLISECONDS.sleep(300);

             object = map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取缓存成功(有锁).... Value是："+object);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }
        return object;
    }

    public  void clear(){
        map.clear();
    }
}



    // 无锁示例
class MyCacheNoLock { // 缓存资源类

    private volatile Map<String,Object> map = new HashMap<>();

    public void put(String key, Object value){
        System.out.println( Thread.currentThread().getName()+"正在写入缓存....  Key是："+key);
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(key,value);
        System.out.println(Thread.currentThread().getName()+"写入缓存成功.... Key是："+key);

    }

    public Object get(String key){
        System.out.println(Thread.currentThread().getName()+"正在读取缓存.... Key是："+key);
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"读取缓存成功.... Key是："+key);
        return map.get(key);
    }
}