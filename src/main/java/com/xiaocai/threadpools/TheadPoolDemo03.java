package com.xiaocai.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/2 22:36
 * @version: v1.0
 */
public class TheadPoolDemo03 {

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newCachedThreadPool();

        try {
            for (int i = 1; i <= 10 ; i++) {

                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\t 执行卖票操作了");
                });
                // 暂停
                //TimeUnit.SECONDS.sleep(5);
            }
        } catch (Exception e) {

        } finally {
            // 关闭线程池
            threadPool.shutdown();
        }
    }
}
