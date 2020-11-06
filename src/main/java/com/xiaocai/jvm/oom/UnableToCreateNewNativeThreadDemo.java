package com.xiaocai.jvm.oom;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 模拟 java.lang.OutOfMemoryError: Unable to create new native thread 异常
 * @author: 张小菜
 * @date: 2020/11/4 16:19
 * @version: v1.0
 */
public class UnableToCreateNewNativeThreadDemo {

    public static void main(String[] args) {
        int i =1 ;
        while (true){

            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
