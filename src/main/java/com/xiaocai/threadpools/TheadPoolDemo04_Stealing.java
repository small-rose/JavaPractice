package com.xiaocai.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/2 22:36
 * @version: v1.0
 */
public class TheadPoolDemo04_Stealing {

    public static void main(String[] args) {

        // CPU 核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService threadPool = Executors.newWorkStealingPool(2);

        try {
            for (int i = 1; i <= 16 ; i++) {

                threadPool.execute(new Test());

                //;
            }
        } catch (Exception e) {

        } finally {
            // 关闭线程池
            threadPool.shutdown();
        }
    }
}

class Test implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"\t 执行卖票操作了");
    }
}