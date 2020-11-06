package com.xiaocai.threadpools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/2 22:36
 * @version: v1.0
 */
public class TheadPoolDemo04_Scheduled {

    public static void main(String[] args) {


        ScheduledExecutorService es04 = Executors.newScheduledThreadPool(2);

        es04.schedule(new Thread(()->{
            System.out.println("I im execute after 3s....");
        }), 3, TimeUnit.SECONDS);

        es04.schedule(new Thread(()->{
            System.out.println("I im execute  after 5s....");
        }), 5, TimeUnit.SECONDS);

        es04.shutdown();
    }
}
